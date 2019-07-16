package demo.server;

import demo.shared.Todo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class ClientServiceImpl implements ClientService {

    private final AtomicLong ids = new AtomicLong();
    private final Map<Long, Todo> todos = Collections.synchronizedMap(new HashMap<>());

    @Override
    public List<Todo> getAll() {
        return todos.values()
                .stream()
                .sorted(Comparator.comparing(Todo::getId))
                .collect(Collectors.toList());
    }

    @Override
    public ResponseEntity<Todo> getById(@PathVariable Long id) {
        return todos.values()
                .stream()
                .filter(t -> t.getId().equals(id))
                .map(t -> ResponseEntity.ok().body(t))
                .findFirst()
                .orElse(ResponseEntity.notFound().build());
    }

    @Override
    public Todo create(@RequestBody Todo todo) {
        todo.setId(ids.getAndIncrement());
        todos.put(todo.getId(), todo);
        return todo;
    }

    @Override
    public ResponseEntity<Todo> update(@PathVariable Long id, @RequestBody Todo todo) {
        return todos.values()
                .stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .map(t -> {
                    todos.put(id, todo);
                    return ResponseEntity.ok().body(todo);
                }).orElseGet(
                        () -> ResponseEntity.notFound().build()
                );
    }

    @Override
    public void deleteAll() {
        todos.clear();
    }

    @Override
    public void delete(@PathVariable Long id) {
        todos.remove(id);
    }
}
