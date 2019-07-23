package demo.spring.rest.client.service;

import demo.shared.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> findAll();

    Todo findById(long id);

    Todo create(Todo todo);

    void update(Todo todo);

    void deleteAll();

    void delete(Todo todo);
}
