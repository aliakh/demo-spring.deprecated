package demo.spring4.webmvc.rest.server.service;

import demo.spring4.webmvc.rest.server.model.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {

    List<Todo> findAll();

    Optional<Todo> findById(String id);

    Todo create(Todo todo);

    Todo update(Todo todo);

    void deleteAll();

    void deleteById(String id);
}
