package demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/todo", produces = { MediaType.APPLICATION_JSON_VALUE })
public class TodoController{

    private final AtomicLong ids = new AtomicLong();
    private final Map<Long, Todo> todos = Collections.synchronizedMap(Collections.emptyMap());

    @GetMapping(value = "/all")
    public List<Todo> getAll() {
        return todos.values()
                .stream()
                .sorted(Comparator.comparing(Todo::getId))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Todo getById(@PathVariable Long id) {
        return todos.values()
                .stream()
                .filter(todo -> todo.getId().equals(id))
                .findFirst().orElseThrow(() -> new NoSuchElementException());
    }

    @PostMapping("/")
    public  Todo create(@RequestBody Todo todo) {
        return todos.put(ids.getAndIncrement(), todo);
    }

    @PutMapping("/{id}")
    public Todo updateEmployee(@RequestBody Todo todo, @PathVariable Long id) {
        Optional<Todo> todoOptional=  todos.values()
                .stream()
                .filter(t -> t.getId().equals(id))
                .findFirst();
        if (todoOptional.isPresent()) {
            todos.put(id, todo);
            return todo;
        } else {
            throw new NoSuchElementException();
        }
    }

    @DeleteMapping("/{id}")
    void deleteEmployee(@PathVariable Long id) {
        todos.remove(id);
    }
}
