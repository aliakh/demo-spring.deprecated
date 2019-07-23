package demo.spring5.webflux.rest.server.functional.service;

import demo.spring5.rest.shared.model.Todo;
import demo.spring5.webflux.rest.server.functional.repository.TodoRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoRepository bookRepository;

    public TodoServiceImpl(TodoRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Flux<Todo> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Mono<Todo> findById(String id) {
        return bookRepository.findById(id);
    }

    @Override
    public Mono<Todo> create(Todo todo) {
        return bookRepository.insert(todo);
    }

    @Override
    public Mono<Todo> update(Todo todo) {
        return bookRepository.save(todo);
    }

    @Override
    public Mono<Void> deleteAll() {
        return bookRepository.deleteAll();
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return bookRepository.deleteById(id);
    }
}
