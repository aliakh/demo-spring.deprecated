package demo.spring.rest.client;

import demo.shared.Todo;
import demo.spring.rest.client.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoSpringRestClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoSpringRestClient.class);

    @Autowired
    private TodoService todoService;

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringRestClient.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            LOGGER.info("start");

            delay();
            todoService.deleteAll();
            LOGGER.info("all after deleteAll: " + todoService.findAll());

            delay();
            Todo todo = todoService.create(new Todo("to do something", false));
            LOGGER.info("created: " + todo);

            delay();
            LOGGER.info("all after create: " + todoService.findAll());

            delay();
            LOGGER.info("findById: " + todoService.findById(todo.getId()));

            delay();
            todo.setDone(true);
            todoService.update(todo);
            LOGGER.info("all after update: " + todoService.findAll());

            delay();
            todoService.delete(todo);
            LOGGER.info("all after delete: " + todoService.findAll());

            LOGGER.info("finish");
        };
    }

    private void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}