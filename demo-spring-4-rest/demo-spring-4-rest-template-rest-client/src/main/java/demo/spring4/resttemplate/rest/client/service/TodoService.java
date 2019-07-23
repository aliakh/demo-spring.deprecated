package demo.spring4.resttemplate.rest.client.service;

import demo.spring4.resttemplate.rest.client.model.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> findAll();

    Todo findById(String id);

    Todo create(Todo todo);

    void update(Todo todo);

    void deleteAll();

    void delete(Todo todo);
}
