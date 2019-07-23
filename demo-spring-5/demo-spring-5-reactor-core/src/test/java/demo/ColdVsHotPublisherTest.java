package demo;

import org.junit.Test;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;

import java.util.Arrays;

public class ColdVsHotPublisherTest {

    @Test
    public void coldPublisher() {
        Flux<String> flux = Flux
                .fromIterable(Arrays.asList("Alfa", "Bravo", "Charlie", "Delta"))
                .map(String::toUpperCase);

        flux.subscribe(s -> System.out.println("subscriber 1 to cold source: " + s));
        flux.subscribe(s -> System.out.println("subscriber 2 to cold source: " + s));
    }

    @Test
    public void hotPublisher() {
        DirectProcessor<String> hotSource = DirectProcessor.create();
        Flux<String> flux = hotSource.map(String::toUpperCase);

        flux.subscribe(s -> System.out.println("subscriber 1 to hot source: " + s));

        hotSource.onNext("Alfa");
        hotSource.onNext("Bravo");

        flux.subscribe(s -> System.out.println("subscriber 2 to hot source: " + s));

        hotSource.onNext("Charlie");
        hotSource.onNext("Delta");

        hotSource.onComplete();
    }
}
