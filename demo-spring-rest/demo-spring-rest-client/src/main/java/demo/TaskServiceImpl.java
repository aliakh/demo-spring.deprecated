package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class TaskServiceImpl implements TaskService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Todo> getAll() {
        return restTemplate.getForObject("https://localhost:8080/all", List.class);
    }

    @Override
    public Todo getById(long id) {
        return  restTemplate.getForObject("https://localhost:8080/", Todo.class);
    }

    @Override
    public Todo create(Todo task) {
        return restTemplate.postForObject("https://localhost:8080/", Todo.class, task);
    }

    @Override
    public Todo update(Todo task) {
        return restTemplate.put("https://localhost:8080/", Todo.class, task);
    }

    @Override
    public void delete(Todo task) {
        restTemplate.delete("https://localhost:8080/", Todo.class, task);
    }
}
