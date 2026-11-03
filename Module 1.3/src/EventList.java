import java.util.PriorityQueue;

public class EventList {
    private final PriorityQueue<Event> events = new PriorityQueue<>();

    public void add(Event e)    { events.add(e); }
    public Event removeNext()   { return events.poll(); }
    public int size()           { return events.size(); }
    public boolean isEmpty()    { return events.isEmpty(); }

    public void print() {
        for (Event e : events) System.out.println(e);
    }
}