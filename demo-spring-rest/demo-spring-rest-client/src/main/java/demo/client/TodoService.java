package demo.client;

import demo.shared.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> getAll();

    Todo getById(long id);

    Todo create(Todo task);

    void update(Todo task);

    void deleteAll();

    void delete(Todo task);
}
