package demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class PersonRestController {

    private WebClient client;

    public PersonRestController(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8081").build();
    }

    @GetMapping("/persons")
    Flux<Person> getPersons() {
        return client.get().uri("/persons?delay=2").retrieve().bodyToFlux(Person.class);
    }

    @GetMapping("/person/{id}")
    Mono<Person> getPerson(@PathVariable Long id) {
        return this.client.get().uri("/person/{id}?delay=2", id).retrieve().bodyToMono(Person.class);
    }

    @GetMapping(path = "/persons/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Person> getPersonStream() {
        return this.client.get().uri("/persons/events")
                .accept(MediaType.TEXT_EVENT_STREAM)
                .retrieve()
                .bodyToFlux(Person.class);
    }

    @GetMapping("/persons/hobbies")
    Flux<Map<String, String>> getPersonsHobbies() {
        return Flux.just(1, 2, 3, 4, 5)
                .take(5)
                .flatMapSequential(personId -> {
                    Mono<String> nameMono = client.get().uri("/person/{id}?delay=2", personId)
                            .retrieve()
                            .bodyToMono(Person.class)
                            .map(Person::getName);

                    Mono<String> hobbyMono = client.get().uri("/person/{id}/hobby?delay=1", personId)
                            .retrieve()
                            .bodyToMono(Hobby.class)
                            .map(Hobby::getHobby);

                    return Mono.zip(nameMono, hobbyMono, (personName, hobby) -> {
                        Map<String, String> data = new LinkedHashMap<>();
                        data.put("person", personName);
                        data.put("hobby", hobby);
                        return data;
                    });
                });
    }
}
