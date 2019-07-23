package demo;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SchedulerTest {

    @Test
    public void subscribeOn() throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        Flux.just(1, 2, 3)
                .log()
                .map(i -> i * 2)
                .subscribeOn(Schedulers.parallel())
                .subscribe(list::add);

        Thread.sleep(1000);

        assertThat(list).containsExactly(2, 4, 6);
    }
}
