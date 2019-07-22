package demo;

import demo.service.DemoService;
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
public class JdkProxyApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(JdkProxyApplication.class);

    @Autowired
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(JdkProxyApplication.class);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            LOGGER.info("Service: " + demoService);
            LOGGER.info("Class: " + demoService.getClass());
            LOGGER.info("getAllInterfaces: " + Arrays.toString(ClassUtils.getAllInterfaces(demoService)));
            LOGGER.info("Superclass: " + demoService.getClass().getSuperclass());
            LOGGER.info("Sum: " + demoService.add(2,3));
        };
    }
}