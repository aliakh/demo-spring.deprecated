package demo.spring4.resttemplate.rest.client.model;

public class Todo {

    private String id;
    private String text;
    private boolean done;

    public Todo() {
    }

    public Todo(String text, boolean done) {
        this.text = text;
        this.done = done;
    }

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
        return new StringBuilder("Todo{")
                .append("id=").append(id)
                .append(", text='").append(text).append('\'')
                .append(", done=").append(done)
                .append('}')
                .toString();
    }
}
