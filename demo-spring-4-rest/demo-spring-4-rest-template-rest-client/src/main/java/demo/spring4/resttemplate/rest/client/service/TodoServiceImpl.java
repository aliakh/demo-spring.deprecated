package demo.spring4.resttemplate.rest.client.service;

import demo.spring4.resttemplate.rest.client.model.Todo;
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
    public List<Todo> findAll() {
        return restTemplate.exchange(
                clientUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Todo>>() {
                }).getBody();
    }

    @Override
    public Todo findById(String id) {
        return restTemplate.getForObject(clientUrl + "/" + id, Todo.class);
    }

    @Override
    public Todo create(Todo todo) {
        return restTemplate.postForObject(clientUrl, todo, Todo.class);
    }

    @Override
    public void update(Todo todo) {
        restTemplate.put(clientUrl + "/" + todo.getId(), todo, Todo.class);
    }

    public void deleteAll() {
        restTemplate.delete(clientUrl);
    }

    @Override
    public void delete(Todo todo) {
        restTemplate.delete(clientUrl + "/" + todo.getId());
    }
}
