package demo;

import demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    @Autowired
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            LOGGER.info("Service: " + demoService);
            LOGGER.info("Class: " + demoService.getClass());
            LOGGER.info("Superclass: " + demoService.getClass().getSuperclass());
            LOGGER.info("Sum: " + demoService.add(2,3));
        };
    }
}