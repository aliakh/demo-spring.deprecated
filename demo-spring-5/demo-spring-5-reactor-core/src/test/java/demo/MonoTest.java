package demo;

import org.junit.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MonoTest {

    @Test
    public void monoJust() {
        Mono<Integer> just = Mono.just(0);
    }

    @Test
    public void monoSubscribeConsumer() {
        List<Integer> list = new ArrayList<>();

        Mono.just(0)
                .log()
                .subscribe(list::add);

        assertThat(list).containsExactly(0);
    }

    @Test
    public void monoSubscribeSubscriber() {
        List<Integer> list = new ArrayList<>();

        Mono.just(0)
                .log()
                .subscribe(new Subscriber<Integer>() {

                    @Override
                    public void onSubscribe(Subscription s) {
                        s.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(Integer i) {
                        list.add(i);
                    }

                    @Override
                    public void onError(Throwable t) {
                    }

                    @Override
                    public void onComplete() {
                    }
                });

        assertThat(list).containsExactly(0);
    }
}

