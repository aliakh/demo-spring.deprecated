package demo.shared;

import java.time.LocalTime;
import java.util.StringJoiner;

public class Event {

    private int id;
    private String mediaType;
    private LocalTime time;

    public Event() {
    }

    public Event(int id, String mediaType) {
        this.id = id;
        this.mediaType = mediaType;
        this.time = LocalTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Event.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("mediaType='" + mediaType + "'")
                .add("time=" + time)
                .toString();
    }
}
