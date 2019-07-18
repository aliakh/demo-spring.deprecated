package demo.server;

import demo.shared.Todo;
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

import java.util.List;

@RestController
@RequestMapping(value = "/todo", produces = {MediaType.APPLICATION_JSON_VALUE})
public class TodoRestController {

    @Autowired
    private TodoService todoService;

    @GetMapping(value = "")
    public List<Todo> getAll() {
        return todoService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getById(@PathVariable Long id) {
        return todoService.getById(id)
                .map(t -> ResponseEntity.ok().body(t))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Todo> update(@PathVariable Long id, @RequestBody Todo todo) {
        return todoService.update(todo)
                .map(t -> ResponseEntity.ok().body(t))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("")
    @ResponseStatus(HttpStatus.OK)
    public void deleteAll() {
        todoService.deleteAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        todoService.delete(id);
    }
}
