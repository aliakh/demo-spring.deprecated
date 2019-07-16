package demo.client;

import demo.shared.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TodoServerServiceImpl implements TodoServerService {

    private static final String URL = "http://localhost:8080/todo";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Todo> getAll() {
        ResponseEntity<List<Todo>> response = restTemplate.exchange(
                URL ,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Todo>>() {
                });
        return response.getBody();
    }

    @Override
    public Todo getById(long id) {
        return restTemplate.getForObject(URL + "/" + id, Todo.class);
    }

    @Override
    public Todo create(Todo task) {
        return restTemplate.postForObject(URL + "/", task, Todo.class);
    }

    @Override
    public void update(Todo task) {
        restTemplate.put(URL + "/" + task.getId(), task, Todo.class);
    }

    public void deleteAll() {
        restTemplate.delete(URL);
    }

    @Override
    public void delete(Todo task) {
        restTemplate.delete(URL + "/" + task.getId());
    }
}
