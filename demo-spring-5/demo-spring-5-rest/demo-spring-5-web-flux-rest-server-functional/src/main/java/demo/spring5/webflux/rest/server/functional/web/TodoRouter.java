package demo.spring5.webflux.rest.server.functional.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class TodoRouter {

    @Bean
    public RouterFunction<ServerResponse> route(TodoHandler handler) {
        return RouterFunctions
                .route(GET("/todo").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(GET("/todo/{id}").and(accept(MediaType.APPLICATION_STREAM_JSON)), handler::findById)
                .andRoute(POST("/todo").and(accept(MediaType.APPLICATION_JSON)), handler::create)
                .andRoute(PUT("/todo").and(accept(MediaType.APPLICATION_JSON)), handler::update)
                .andRoute(DELETE("/todo").and(accept(MediaType.APPLICATION_JSON)), handler::deleteAll)
                .andRoute(DELETE("/todo/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::deleteById);
    }
}
