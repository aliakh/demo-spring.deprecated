package demo.server.functional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_STREAM_JSON;
import static org.springframework.http.MediaType.TEXT_EVENT_STREAM;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class EventRouter {

    @Bean
    public RouterFunction<ServerResponse> route(EventHandler eventHandler) {
        return RouterFunctions
                .route(GET("/event").and(accept(APPLICATION_STREAM_JSON)), eventHandler::getEvent)
                .andRoute(GET("/events").and(accept(TEXT_EVENT_STREAM)), eventHandler::getEvents);
    }
}
