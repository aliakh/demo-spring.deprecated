package demo.server.annotated;

import demo.shared.Event;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

@RestController
public class EventRestController {

    private final AtomicInteger id = new AtomicInteger();

    @GetMapping(value = "/event", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    Mono<Event> getEvent() {
        return Mono.just(new Event(this.id.getAndIncrement(), MediaType.APPLICATION_STREAM_JSON_VALUE));
    }

    @GetMapping(value = "/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Event> getEvents() {
        Flux<Event> eventFlux = Flux.fromStream(Stream.generate(() -> new Event(this.id.getAndIncrement(), MediaType.TEXT_EVENT_STREAM_VALUE)));
        Flux<Long> durationFlux = Flux.interval(Duration.ofSeconds(1));
        return Flux.zip(eventFlux, durationFlux).map(Tuple2::getT1);
    }

    @GetMapping(value = "/events2", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ServerSentEvent<Event>> getEvents2() {
        return Flux.interval(Duration.ofSeconds(1)).map(n -> {
                    int id = this.id.getAndIncrement();
                    return ServerSentEvent.<Event>builder()
                            .data(new Event(id, MediaType.TEXT_EVENT_STREAM_VALUE))
                            .id("id" + id)
                            .comment("comment" + id)
                            .event("event" + id)
                            .build();
                }
        );
    }
}

