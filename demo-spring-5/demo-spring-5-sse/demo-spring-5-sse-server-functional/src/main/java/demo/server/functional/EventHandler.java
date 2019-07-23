package demo.server.functional;

import demo.shared.Event;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static org.springframework.http.MediaType.APPLICATION_STREAM_JSON;
import static org.springframework.http.MediaType.TEXT_EVENT_STREAM;
import static org.springframework.web.reactive.function.BodyInserters.fromServerSentEvents;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class EventHandler {

    private final AtomicInteger id = new AtomicInteger();

    Mono<ServerResponse> getEvent(ServerRequest request) {
        Mono<Event> publisher = Mono.just(new Event(this.id.getAndIncrement(), MediaType.APPLICATION_STREAM_JSON_VALUE));
        return ok()
                .contentType(APPLICATION_STREAM_JSON)
                .body(publisher, Event.class);
    }

    Mono<ServerResponse> getEvents(ServerRequest request) {
        Flux<Event> eventFlux = Flux.fromStream(Stream.generate(() -> new Event(this.id.getAndIncrement(), MediaType.TEXT_EVENT_STREAM_VALUE)));
        Flux<Long> durationFlux = Flux.interval(Duration.ofSeconds(1));
        Flux<Event> publisher = Flux.zip(eventFlux, durationFlux).map(Tuple2::getT1);
        return ok()
                .contentType(TEXT_EVENT_STREAM)
                .body(publisher, Event.class);
    }

    Mono<ServerResponse> getEvents2(ServerRequest request) {
        return ServerResponse.ok().body(fromServerSentEvents(
                Flux.interval(Duration.ofSeconds(1))
                        .map(i -> new Event(this.id.getAndIncrement(), MediaType.TEXT_EVENT_STREAM_VALUE))
                        .map(event -> ServerSentEvent.builder(event).build())));
    }
}
