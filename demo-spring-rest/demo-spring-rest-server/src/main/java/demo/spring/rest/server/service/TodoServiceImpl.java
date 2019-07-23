package demo.spring.rest.server.service;

import demo.shared.Todo;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService {

    private final AtomicLong ids = new AtomicLong();
    private final Map<Long, Todo> idsToTodos = new ConcurrentHashMap<>();

    @Override
    public List<Todo> findAll() {
        return idsToTodos.values()
                .stream()
                .sorted(Comparator.comparing(Todo::getId))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Todo> findById(Long id) {
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
    public Todo update(Todo todo) {
        return idsToTodos.values()
                .stream()
                .filter(t -> t.getId().equals(todo.getId()))
                .findFirst()
                .map(t -> {
                    idsToTodos.put(todo.getId(), todo);
                    return todo;
                }).get();
    }

    @Override
    public void deleteAll() {
        idsToTodos.clear();
    }

    @Override
    public void deleteById(Long id) {
        idsToTodos.remove(id);
    }
}
