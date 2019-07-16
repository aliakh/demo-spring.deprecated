package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Todo> getAll() {
        ResponseEntity<List<Todo>> response = restTemplate.exchange(
                "http://localhost:8080/todo/all/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Todo>>(){});
        return response.getBody();
    }

    @Override
    public Todo getById(long id) {
        return  restTemplate.getForObject("http://localhost:8080/todo/"+id, Todo.class);
    }

    @Override
    public Todo create(Todo task) {
        return restTemplate.postForObject("http://localhost:8080/todo/", task, Todo.class);
    }

    @Override
    public void update(Todo task) {
         restTemplate.put("http://localhost:8080/todo"+task.getId(), task, Todo.class);
    }

    @Override
    public void delete(Todo task) {
        restTemplate.delete("http://localhost:8080/todo", Todo.class, task);
    }
}
