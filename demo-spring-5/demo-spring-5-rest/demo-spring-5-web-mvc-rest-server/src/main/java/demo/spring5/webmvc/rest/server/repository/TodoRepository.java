package demo.spring5.webmvc.rest.server.repository;

import demo.spring5.rest.shared.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {
}
