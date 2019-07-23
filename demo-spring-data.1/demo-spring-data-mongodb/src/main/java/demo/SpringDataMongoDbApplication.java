package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataMongoDbApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringDataMongoDbApplication.class);

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataMongoDbApplication.class, args);
    }

    @Override
    public void run(String... args) {
        repository.deleteAll();

        repository.save(new Customer("Alice", "Smith"));
        repository.save(new Customer("Bob", "Smith"));

        log.info("Customers found with findAll():");
        log.info("-------------------------------");
        for (Customer customer : repository.findAll()) {
            log.info(customer.toString());
        }
        log.info("");

        log.info("Customer found with findByFirstName('Alice'):");
        log.info("--------------------------------");
        log.info(repository.findByFirstName("Alice").toString());
        log.info("");

        log.info("Customers found with findByLastName('Smith'):");
        log.info("--------------------------------");
        for (Customer customer : repository.findByLastName("Smith")) {
            log.info(customer.toString());
        }
        log.info("");
    }
}
