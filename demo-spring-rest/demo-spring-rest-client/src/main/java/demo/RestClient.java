package demo;

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
public class RestClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestClient.class);

    @Autowired
    private TaskService taskService;

    public static void main(String args[]) {
        SpringApplication.run(RestClient.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            LOGGER.info("Start");

            delay();
            LOGGER.info("Tasks: " + taskService.getAll());

            delay();
            Todo todo1 = new Todo();
            todo1.setText("create");
            todo1.setDone(false);
            Todo todo2 = taskService.create(todo1);
            LOGGER.info("Task after creation: " + todo2);

            delay();
            LOGGER.info("Tasks after creation: " + taskService.getAll());

            delay();
            LOGGER.info("Find by id: " + taskService.getById(todo2.getId()));

            delay();
            todo1.setDone(true);
            taskService.update(todo1);
            LOGGER.info("Tasks after updating: " + taskService.getAll());

            delay();
            taskService.delete(todo1);
            LOGGER.info("Tasks after deleting: " + taskService.getAll());

            LOGGER.info("Finish");
        };
    }

    private void delay() throws InterruptedException {
        Thread.sleep(1000);
    }
}