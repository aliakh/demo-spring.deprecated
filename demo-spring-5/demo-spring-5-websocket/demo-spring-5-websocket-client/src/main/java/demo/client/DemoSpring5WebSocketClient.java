package demo.client;

import org.springframework.web.reactive.socket.WebSocketMessage;
import org.springframework.web.reactive.socket.client.ReactorNettyWebSocketClient;
import org.springframework.web.reactive.socket.client.WebSocketClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.time.Duration;

public class DemoSpring5WebSocketClient {

    public static void main(String[] args) {
        WebSocketClient client = new ReactorNettyWebSocketClient();
        client.execute(
                URI.create("ws://localhost:8080/ws"),
                session -> session.send(
                        Mono.just(session.textMessage("event from Java client to server")))
                        .thenMany(session.receive()
                                .map(WebSocketMessage::getPayloadAsText)
                                .log())
                        .then())
                .block(Duration.ofSeconds(60L));
    }
}
