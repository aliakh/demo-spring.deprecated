package demo;

import reactor.core.publisher.Flux;

import java.util.stream.Stream;

public class FluxVsStream {

    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        System.out.println("Java 8 Stream");
        Stream.of(numbers)
                .skip(1)
                .limit(3)
                .filter(number -> number.startsWith("t"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("Spring Reactor");
        Flux.just(numbers)
                .skip(1)
                .take(3)
                .filter(number -> number.startsWith("t"))
                .map(String::toUpperCase)
                .subscribe(System.out::println);
    }
}
