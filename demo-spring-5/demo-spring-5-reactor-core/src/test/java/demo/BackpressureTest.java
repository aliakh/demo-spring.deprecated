package demo;

import org.junit.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BackpressureTest {

    @Test
    public void request() {
        List<Integer> list = new ArrayList<>();

        Flux.just(1, 2, 3)
                .log()
                .subscribe(new Subscriber<Integer>() {
                    private Subscription s;
                    private int count;

                    @Override
                    public void onSubscribe(Subscription s) {
                        this.s = s;
                        s.request(2);
                    }

                    @Override
                    public void onNext(Integer i) {
                        list.add(i);
                        count++;
                        if (count % 2 == 0) {
                            s.request(2);
                        }
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
