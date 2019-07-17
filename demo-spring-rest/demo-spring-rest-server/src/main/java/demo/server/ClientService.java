package demo.server;

import demo.shared.Todo;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<Todo> getAll();

    Optional<Todo> getById(@PathVariable Long id);

    Todo create(Todo todo);

    Optional<Todo> update(Todo todo);

    void deleteAll();

    void delete(Long id);
}
