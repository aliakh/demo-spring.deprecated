package demo.spring5.webflux.rest.server.functional.service;

import demo.spring5.rest.shared.model.Todo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TodoService {

    Flux<Todo> findAll();

    Mono<Todo> findById(String id);

    Mono<Todo> create(Todo todo);

    Mono<Todo> update(Todo todo);

    Mono<Void> deleteAll();

    Mono<Void> deleteById(String id);
}
