package demo.test;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class StepVerifierTest {

    @Test
    public void testExpectNext() {
        Flux<String> flux = Flux.fromIterable(Arrays.asList("Alfa", "Bravo", "Charlie"));

        StepVerifier.create(flux)
                .expectNext("Alfa", "Bravo", "Charlie")
                .expectComplete()
                .verify();
    }

    @Test
    public void testConsumeNextWith() {
        Flux<String> flux = Flux.fromIterable(Arrays.asList("Alfa", "Bravo", "Charlie"));

        StepVerifier.create(flux)
                .consumeNextWith(s -> assertThat(s).isEqualTo("Alfa"))
                .consumeNextWith(s -> assertThat(s).isEqualTo("Bravo"))
                .consumeNextWith(s -> assertThat(s).isEqualTo("Charlie"))
                .expectComplete()
                .verify();
    }

    @Test
    public void testWithVirtualTime() {
        Duration duration = StepVerifier.withVirtualTime(() -> Mono.just("Alfa")
                .delaySubscription(Duration.ofSeconds(30)))
                .expectSubscription()
                .thenAwait(Duration.ofSeconds(10))
                .expectNoEvent(Duration.ofSeconds(10))
                .thenAwait(Duration.ofSeconds(10))
                .expectNext("Alfa")
                .expectComplete()
                .verify();

        System.out.println(String.format("Test duration: %d ms", duration.toMillis()));
    }
}
