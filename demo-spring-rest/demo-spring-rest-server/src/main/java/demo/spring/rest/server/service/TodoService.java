package demo.spring.rest.server.service;

import demo.shared.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {

    List<Todo> findAll();

    Optional<Todo> findById(Long id);

    Todo create(Todo todo);

    Todo update(Todo todo);

    void deleteAll();

    void deleteById(Long id);
}
