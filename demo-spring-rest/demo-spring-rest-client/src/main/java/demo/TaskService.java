package demo;

import java.util.List;

public interface TaskService {

    public List<Todo> getAll() ;

    public Todo getById(long id) ;

    public Todo create(Todo task) ;

    public void update(Todo task) ;

    public void delete(Todo task) ;
}
