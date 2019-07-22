package demo;

import demo.shared.Todo;
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
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(RestClient.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            LOGGER.info("Start");

            delay();
            demoService.deleteAll();
            LOGGER.info("Tasks: " + demoService.getAll());

            delay();
            Todo todo1 = new Todo();
            todo1.setText("do something");
            todo1.setDone(false);
            Todo todo2 = demoService.create(todo1);
            LOGGER.info("Task after creation: " + todo2);

            delay();
            LOGGER.info("Tasks after creation: " + demoService.getAll());

            delay();
            LOGGER.info("Find by id: " + demoService.getById(todo2.getId()));

            delay();
            todo2.setDone(true);
            demoService.update(todo2);
            LOGGER.info("Tasks after updating: " + demoService.getAll());

            delay();
            demoService.delete(todo2);
            LOGGER.info("Tasks after deleting: " + demoService.getAll());

            LOGGER.info("Finish");
        };
    }

    private void delay() throws InterruptedException {
        Thread.sleep(1000);
    }
}