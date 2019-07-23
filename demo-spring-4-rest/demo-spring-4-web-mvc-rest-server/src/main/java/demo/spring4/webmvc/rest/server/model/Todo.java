package demo.spring4.webmvc.rest.server.model;

import org.springframework.data.annotation.Id;

import java.util.StringJoiner;

public class Todo {

    @Id
    private String id;
    private String text;
    private boolean done;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Todo.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("text='" + text + "'")
                .add("done=" + done)
                .toString();
    }
}
