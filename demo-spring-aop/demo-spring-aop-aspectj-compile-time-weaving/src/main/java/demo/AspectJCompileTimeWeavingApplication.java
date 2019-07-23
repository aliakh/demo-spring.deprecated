package demo;

import demo.service.IDemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ClassUtils;

import java.util.Arrays;

@SpringBootApplication
public class AspectJCompileTimeWeavingApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(AspectJCompileTimeWeavingApplication.class);

    @Autowired
    private IDemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(AspectJCompileTimeWeavingApplication.class);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            LOGGER.info("Service: " + demoService);
            LOGGER.info("Service class: " + demoService.getClass());
            LOGGER.info("Service interfaces: " + Arrays.toString(ClassUtils.getAllInterfaces(demoService)));
            LOGGER.info("Service superclass: " + demoService.getClass().getSuperclass());

            LOGGER.info("Result: " + demoService.add(2, 3));
        };
    }
}
