package demo.server;

public class Event {

    private final String id;
    private final String time;

    public Event(String id, String time) {
        this.id = id;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public String getTime() {
        return time;
    }
}
