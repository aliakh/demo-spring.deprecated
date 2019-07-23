package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableNeo4jRepositories
public class SpringDataNeo4jApplication implements CommandLineRunner {

    private final static Logger log = LoggerFactory.getLogger(SpringDataNeo4jApplication.class);

    @Autowired
    private PersonRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataNeo4jApplication.class, args);
    }

    @Override
    public void run(String... args) {
        repository.deleteAll();

        Person person1 = new Person("Greg");
        Person person2 = new Person("Roy");
        Person person3 = new Person("Craig");

        List<Person> team = Arrays.asList(person1, person2, person3);

        log.info("Persons from the team:");
        log.info("-------------------------------");
        for (Person person : team) {
            log.info(person.toString());
        }
        log.info("");

        repository.save(person1);
        repository.save(person2);
        repository.save(person3);

        person1 = repository.findByName(person1.getName());
        person1.worksWith(person2);
        person1.worksWith(person3);
        repository.save(person1);

        person2 = repository.findByName(person2.getName());
        person2.worksWith(person3);
        repository.save(person2);

        log.info("Persons from the team found with findByName():");
        log.info("-------------------------------");
        for (Person person : team) {
            log.info(repository.findByName(person.getName()).toString());
        }
        log.info("");
    }
}
