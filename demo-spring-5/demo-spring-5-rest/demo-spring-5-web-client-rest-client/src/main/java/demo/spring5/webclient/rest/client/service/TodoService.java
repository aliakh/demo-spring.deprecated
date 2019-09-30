package demo.spring5.webclient.rest.client.service;

import demo.spring5.webclient.rest.client.model.Todo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TodoService {

    Flux<Todo> getAll();

    Mono<Todo> getById(String id);

    Mono<Todo> create(Todo todo);

    Mono<Void> update(Todo todo);

    Mono<Void> deleteAll();

    Mono<Void> delete(Todo todo);
}
