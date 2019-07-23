package demo.spring5.webclient.rest.client.service;

import demo.spring5.rest.shared.model.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;

@Service
public class TodoServiceImpl implements TodoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TodoServiceImpl.class);

    private WebClient webClient;

    @Value("${client.url}")
    private String clientUrl;

    @PostConstruct
    public void setUp() {
        webClient = WebClient.builder()
                .baseUrl(clientUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .filter(ExchangeFilterFunction.ofRequestProcessor(request -> {
                    LOGGER.info("Request: {} {}", request.method(), request.url());
                    return Mono.just(request);
                }))
                .filter(ExchangeFilterFunction.ofResponseProcessor(response -> {
                    LOGGER.info("Response: {}", response.statusCode());
                    return Mono.just(response);
                }))
                .build();
    }

    @Override
    public Flux<Todo> getAll() {
        return webClient.get()
                .uri("")
                .retrieve()
                .bodyToFlux(Todo.class);
    }

    @Override
    public Mono<Todo> getById(String id) {
        return webClient.get()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(Todo.class);
    }

    @Override
    public Mono<Todo> create(Todo todo) {
        return webClient.post()
                .uri("")
                .body(Mono.just(todo), Todo.class)
                .retrieve()
                .bodyToMono(Todo.class);
    }

    @Override
    public Mono<Void> update(Todo todo) {
        return webClient.put()
                .uri("/{id}", todo.getId())
                .body(Mono.just(todo), Todo.class)
                .retrieve()
                .bodyToMono(Void.class);
    }

    public Mono<Void> deleteAll() {
        return webClient.delete()
                .uri(clientUrl)
                .retrieve()
                .bodyToMono(Void.class);
    }

    @Override
    public Mono<Void> delete(Todo todo) {
        return webClient.delete()
                .uri("/{id}", todo.getId())
                .retrieve()
                .bodyToMono(Void.class);
    }
}
