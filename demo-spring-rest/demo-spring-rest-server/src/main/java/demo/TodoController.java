package demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/todo", produces = {MediaType.APPLICATION_JSON_VALUE})
public class TodoController {

    private final AtomicLong ids = new AtomicLong();
    private final Map<Long, Todo> todos = Collections.synchronizedMap(new HashMap<>());

    @GetMapping(value = "/all")
    public List<Todo> getAll() {
        return todos.values()
                .stream()
                .sorted(Comparator.comparing(Todo::getId))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getById(@PathVariable Long id) {
        return todos.values()
                .stream()
                .filter(t -> t.getId().equals(id))
                .map(t -> ResponseEntity.ok().body(t))
                .findFirst()
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo create(@RequestBody Todo todo) {
        todo.setId(ids.getAndIncrement());
        return todos.put(todo.getId(), todo);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Todo> update(@PathVariable Long id, @RequestBody Todo todo) {
        return todos.values()
                .stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .map(t -> {
                    todos.put(id, todo);
                    return ResponseEntity.ok().body(todo);
                }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        todos.remove(id);
    }
}
