package demo.spring4.webmvc.rest.server.web;

import demo.spring4.webmvc.rest.server.model.Todo;
import demo.spring4.webmvc.rest.server.service.TodoService;
import org.springframework.http.HttpStatus;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoRestController {

    private final TodoService todoService;

    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public List<Todo> findAll() {
        return todoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getById(@PathVariable("id") String id) {
        return todoService.findById(id)
                .map(foundTodo -> ResponseEntity.ok().body(foundTodo))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("")
    public ResponseEntity<Todo> create(@RequestBody Todo todo) {
        Todo createdTodo = todoService.create(todo);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdTodo.getId()).toUri();
        return ResponseEntity.created(location).body(createdTodo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> update(@PathVariable("id") String id, @RequestBody Todo todo) {
        return todoService.findById(id)
                .map(foundTodo -> {
                    foundTodo.setText(todo.getText());
                    foundTodo.setDone(todo.isDone());
                    Todo updatedTodo = todoService.update(foundTodo);
                    return ResponseEntity.ok().body(updatedTodo);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("")
    @ResponseStatus(HttpStatus.OK)
    public void deleteAll() {
        todoService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
        return todoService.findById(id)
                .map(foundTodo -> {
                    todoService.deleteById(id);
                    return ResponseEntity.ok().build();
                })
                .orElse(ResponseEntity.noContent().build());
    }
}
