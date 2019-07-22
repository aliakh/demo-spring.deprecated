package demo;

import demo.service.DemoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ClassUtils;

import java.util.Arrays;

// Can use this instead of spring.aop.proxy-target-class=true
// to force CGLIB proxies for all Spring bean proxies.
// @EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication
public class CglibProxyApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CglibProxyApplication.class);

    @Autowired
    private DemoServiceImpl demoService;

    public static void main(String[] args) {
        SpringApplication.run(CglibProxyApplication.class);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            LOGGER.info("Service: " + demoService);
            LOGGER.info("Class: " + demoService.getClass());
            LOGGER.info("Implemented interfaces: " + Arrays.toString(ClassUtils.getAllInterfaces(demoService)));
            LOGGER.info("Superclass: " + demoService.getClass().getSuperclass());
            LOGGER.info("Sum: " + demoService.add(2,3));
        };
    }
}