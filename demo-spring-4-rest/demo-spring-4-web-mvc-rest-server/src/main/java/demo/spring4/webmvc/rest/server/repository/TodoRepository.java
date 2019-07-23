package demo.spring4.webmvc.rest.server.repository;

import demo.spring4.webmvc.rest.server.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {
}
