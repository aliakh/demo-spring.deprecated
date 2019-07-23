package demo.spring5.webclient.rest.client;

import demo.spring5.rest.shared.model.Todo;
import demo.spring5.webclient.rest.client.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@Configuration
public class CommandLineRunnerConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommandLineRunnerConfiguration.class);

    private final TodoService todoService;

    public CommandLineRunnerConfiguration(TodoService todoService) {
        this.todoService = todoService;
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            LOGGER.info("start");

            delay();
            todoService.deleteAll();
            LOGGER.info("all after deleteAll: " + block(todoService.getAll()));

            delay();
            Todo todo = block(todoService.create(new Todo("to do something", false)));
            LOGGER.info("created: " + todo);

            delay();
            LOGGER.info("all after create: " + block(todoService.getAll()));

            delay();
            LOGGER.info("findById: " + block(todoService.getById(todo.getId())));

            delay();
            todo.setDone(true);
            todoService.update(todo);
            LOGGER.info("all after update: " + block(todoService.getAll()));

            delay();
            todoService.delete(todo);
            LOGGER.info("all after delete: " + block(todoService.getAll()));

            LOGGER.info("finish");
        };
    }

    private <T> T block(Mono<T> mono) {
        return mono.block();
    }

    private <T> List<T> block(Flux<T> flux) {
        return flux.collectList().block(Duration.ofSeconds(10));
    }

    private void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
