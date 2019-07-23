package demo.spring5.webflux.rest.server.functional.repository;

import demo.spring5.rest.shared.model.Todo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TodoRepository extends ReactiveMongoRepository<Todo, String> {
}
