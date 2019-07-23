package demo;

import org.springframework.http.codec.ServerSentEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Map;

import static org.springframework.web.reactive.function.BodyInserters.fromServerSentEvents;

@Component
public class PersonHandler {

    private static final Mono<ServerResponse> NOT_FOUND = ServerResponse.notFound().build();

    Mono<ServerResponse> getPersons(ServerRequest request) {
        return ServerResponse.ok().syncBody(PersonService.PERSON_DATA.values());
    }

    Mono<ServerResponse> getPerson(ServerRequest request) {
        Long personId = Long.parseLong(request.pathVariable("id"));
        Map<String, Object> body = PersonService.PERSON_DATA.get(personId);
        return body != null ? ServerResponse.ok().syncBody(body) : NOT_FOUND;
    }

    Mono<ServerResponse> getPersonHobbies(ServerRequest request) {
        Long personId = Long.parseLong(request.pathVariable("id"));
        Map<String, Object> body = PersonService.HOBBY_DATA.get(personId);
        return body != null ? ServerResponse.ok().syncBody(body) : NOT_FOUND;
    }

    Mono<ServerResponse> getPersonEvents(ServerRequest request) {
        return ServerResponse.ok().body(fromServerSentEvents(
                Flux.interval(Duration.ofSeconds(2))
                        .map(i -> PersonService.PERSON_DATA.get((i % 10) + 1))
                        .map(data -> ServerSentEvent.builder(data).build())));
    }
}

