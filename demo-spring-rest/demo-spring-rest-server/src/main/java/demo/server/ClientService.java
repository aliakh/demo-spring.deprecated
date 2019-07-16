package demo.server;

import demo.shared.Todo;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ClientService {

    List<Todo> getAll();

    Todo getById(@PathVariable Long id);

    Todo create(Todo todo);

    Todo update(Long id, Todo todo);

    void deleteAll();

    void delete(Long id);
}
