import java.time.LocalDateTime;

public class Event implements Comparable<Event> {

    private LocalDateTime eventTime;
    private EventType eventType;

    public Event(LocalDateTime eventTime, EventType eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public LocalDateTime getEventTime() {
        return eventTime;
    }

    public EventType getEventType() {
        return eventType;
    }

    @Override
    public int compareTo(Event other) {
        return this.eventTime.compareTo(other.eventTime);
    }

    @Override
    public String toString() {
        return eventTime + " - " + eventType;
    }
}