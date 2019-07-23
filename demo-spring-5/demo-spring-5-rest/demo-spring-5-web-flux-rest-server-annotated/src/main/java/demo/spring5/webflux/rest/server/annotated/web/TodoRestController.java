package demo.spring5.webflux.rest.server.annotated.web;

import demo.spring5.rest.shared.model.Todo;
import demo.spring5.webflux.rest.server.annotated.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/todo")
public class TodoRestController {

    private final TodoService todoService;

    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public Flux<Todo> findAll() {
        return todoService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Todo> getById(@PathVariable("id") String id) {
        return todoService.findById(id);
    }

    @PostMapping("")
    public Mono<Todo> create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    @PutMapping("/{id}")
    public Mono<Todo> update(@PathVariable("id") String id, @RequestBody Todo todo) {
        return todoService.update(todo);
    }

    @DeleteMapping("")
    @ResponseStatus(HttpStatus.OK)
    public void deleteAll() {
        todoService.deleteAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable String id) {
        todoService.deleteById(id);
    }
}
