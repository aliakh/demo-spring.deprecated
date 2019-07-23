package demo.spring5.webflux.rest.server.annotated.service;

import demo.spring5.rest.shared.model.Todo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TodoService {

    Mono<Todo> findById(String id);

    Flux<Todo> findAll();

    Mono<Todo> create(Todo todo);

    Mono<Todo> update(Todo todo);

    Mono<Void> deleteAll();

    Mono<Void> deleteById(String id);
}
