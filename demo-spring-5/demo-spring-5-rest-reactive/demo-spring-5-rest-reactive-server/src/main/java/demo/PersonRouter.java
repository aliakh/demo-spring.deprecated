package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

@Configuration
public class PersonRouter {

    @Bean
    public RouterFunction<?> routes(PersonHandler handler) {
        return RouterFunctions.route()
                .GET("/persons", handler::getPersons)
                .GET("/person/{id}", handler::getPerson)
                .GET("/person/{id}/hobby", handler::getPersonHobbies)
                .GET("/persons/events", handler::getPersonEvents)
                .filter(new DelayFilter())
                .build();
    }
}
