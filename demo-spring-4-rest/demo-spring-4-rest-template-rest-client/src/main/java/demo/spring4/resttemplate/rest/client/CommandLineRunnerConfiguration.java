package demo.spring4.resttemplate.rest.client;

import demo.spring4.resttemplate.rest.client.model.Todo;
import demo.spring4.resttemplate.rest.client.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
