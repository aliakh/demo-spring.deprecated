package demo;

import org.junit.Test;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PublisherTest {

    @Test
    public void flux() {
        Publisher<Integer> publisher = Flux.just(1, 2, 3);
    }

    @Test
    public void mono() {
        Publisher<Integer> publisher = Mono.just(0);
    }
}
