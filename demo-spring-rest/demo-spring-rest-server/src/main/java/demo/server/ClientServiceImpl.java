package demo.server;

import demo.shared.Todo;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {

    private final AtomicLong ids = new AtomicLong();
    private final Map<Long, Todo> idsToTodos = Collections.synchronizedMap(new HashMap<>());

    @Override
    public List<Todo> getAll() {
        return idsToTodos.values()
                .stream()
                .sorted(Comparator.comparing(Todo::getId))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Todo> getById(Long id) {
        return idsToTodos.values()
                .stream()
                .filter(t -> t.getId().equals(id))
                .findFirst();
    }

    @Override
    public Todo create(Todo todo) {
        todo.setId(ids.getAndIncrement());
        idsToTodos.put(todo.getId(), todo);
        return todo;
    }

    @Override
    public Optional<Todo> update(Long id, Todo todo) {
        return idsToTodos.values()
                .stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .map(t -> {
                    idsToTodos.put(id, todo);
                    return todo;
                });
    }

    @Override
    public void deleteAll() {
        idsToTodos.clear();
    }

    @Override
    public void delete(Long id) {
        idsToTodos.remove(id);
    }
}
