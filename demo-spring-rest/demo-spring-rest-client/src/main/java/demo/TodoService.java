package demo;

import java.util.List;

public interface TodoService {

    List<Todo> getAll() ;

    Todo getById(long id) ;

    Todo create(Todo task) ;

    void update(Todo task) ;

    void delete(Todo task) ;
}
