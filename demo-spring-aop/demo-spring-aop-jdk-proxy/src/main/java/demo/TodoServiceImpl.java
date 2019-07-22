package demo.client;

import demo.shared.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${client.url}")
    private String clientUrl;

    @Override
    public List<Todo> getAll() {
        return restTemplate.exchange(
                clientUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Todo>>() {
                }).getBody();
    }

    @Override
    public Todo getById(long id) {
        return restTemplate.getForObject(clientUrl + "/" + id, Todo.class);
    }

    @Override
    public Todo create(Todo task) {
        return restTemplate.postForObject(clientUrl, task, Todo.class);
    }

    @Override
    public void update(Todo task) {
        restTemplate.put(clientUrl + "/" + task.getId(), task, Todo.class);
    }

    public void deleteAll() {
        restTemplate.delete(clientUrl);
    }

    @Override
    public void delete(Todo task) {
        restTemplate.delete(clientUrl + "/" + task.getId());
    }
}
