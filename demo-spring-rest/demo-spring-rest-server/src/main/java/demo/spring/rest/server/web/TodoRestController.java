package demo.spring.rest.server.web;

import demo.shared.Todo;
import demo.spring.rest.server.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/todo", produces = {MediaType.APPLICATION_JSON_VALUE})
public class TodoRestController {

    @Autowired
    private TodoService todoService;

    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public List<Todo> findAll() {
        return todoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getById(@PathVariable("id") Long id) {
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
    public ResponseEntity<Todo> update(@PathVariable("id") Long id, @RequestBody Todo todo) {
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
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id) {
        return todoService.findById(id)
                .map(foundTodo -> {
                    todoService.deleteById(id);
                    return ResponseEntity.ok().build();
                })
                .orElse(ResponseEntity.noContent().build());
    }
}
