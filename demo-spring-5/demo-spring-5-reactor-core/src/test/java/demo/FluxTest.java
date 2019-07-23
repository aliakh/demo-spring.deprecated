package demo;

import org.junit.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FluxTest {

    @Test
    public void fluxJust() {
        Flux<Integer> just = Flux.just(1, 2, 3);
    }

    @Test
    public void fluxSubscribeConsumer() {
        List<Integer> list = new ArrayList<>();

        Flux.just(1, 2, 3)
                .log()
                .subscribe(list::add);

        assertThat(list).containsExactly(1, 2, 3);
    }

    @Test
    public void fluxSubscribeSubscriber() {
        List<Integer> list = new ArrayList<>();

        Flux.just(1, 2, 3)
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

        assertThat(list).containsExactly(1, 2, 3);
    }
}

