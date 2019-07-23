package demo.client;

import demo.shared.Event;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;

@SpringBootApplication
public class DemoSpring5SseClient {

    @Bean
    WebClient client() {
        return WebClient.create("http://localhost:8080");
    }

    @Bean
    CommandLineRunner run(WebClient client) {
        return args -> {
            client.get()
                    .uri("/event")
                    .accept(MediaType.APPLICATION_STREAM_JSON)
                    .exchange()
                    .flatMap(response -> response.bodyToMono(Event.class))
                    .subscribe(System.out::println);

            client.get()
                    .uri("/events")
                    .accept(MediaType.TEXT_EVENT_STREAM)
                    .exchange()
                    .flatMapMany(response -> response.bodyToFlux(Event.class))
                    .subscribe(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoSpring5SseClient.class, args);
    }
}
