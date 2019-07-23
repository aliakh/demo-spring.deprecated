package demo.spring5.webflux.rest.server.functional.web;

import demo.spring5.rest.shared.model.Todo;
import demo.spring5.webflux.rest.server.functional.service.TodoService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class TodoHandler {

    private final TodoService todoService;

    public TodoHandler(TodoService todoService) {
        this.todoService = todoService;
    }

    public Mono<ServerResponse> findAll(ServerRequest request) {
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(todoService.findAll(), Todo.class);
    }

    public Mono<ServerResponse> findById(ServerRequest request) {
        String id = request.pathVariable("id");
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(todoService.findById(id), Todo.class);
    }

    public Mono<ServerResponse> create(ServerRequest request) {
        Mono<Todo> todo = request.bodyToMono(Todo.class);
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromPublisher(todo.flatMap(todoService::create), Todo.class));
    }

    public Mono<ServerResponse> update(ServerRequest request) {
        String id = request.pathVariable("id");
        Mono<Todo> todo = request.bodyToMono(Todo.class);
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromPublisher(todo.flatMap(todoService::update), Todo.class));
    }

    public Mono<ServerResponse> deleteAll(ServerRequest request) {
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(todoService.deleteAll(), Void.class);
    }

    public Mono<ServerResponse> deleteById(ServerRequest request) {
        String id = request.pathVariable("id");
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(todoService.deleteById(id), Void.class);

    }
}
