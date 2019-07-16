package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class TaskServiceImpl implements TaskService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Todo> getAll() {
        ResponseEntity<List<Todo>> response = restTemplate.exchange(
                "http://localhost:8080/all/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Todo>>(){});
        return response.getBody();
    }

    @Override
    public Todo getById(long id) {
        return  restTemplate.getForObject("https://localhost:8080/"+id, Todo.class);
    }

    @Override
    public Todo create(Todo task) {
        return restTemplate.postForObject("https://localhost:8080/", task, Todo.class);
    }

    @Override
    public void update(Todo task) {
         restTemplate.put("https://localhost:8080/"+task.getId(), task, Todo.class);
    }

    @Override
    public void delete(Todo task) {
        restTemplate.delete("https://localhost:8080/", Todo.class, task);
    }
}
