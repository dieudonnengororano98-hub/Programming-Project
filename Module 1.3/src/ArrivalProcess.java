public class ArrivalProcess {
    private final Negexp generator;
    private final EventType type;

    public ArrivalProcess(Negexp generator, EventType type) {
        this.generator = generator;
        this.type = type;
    }

    public Event generateNext(EventList list) {
        double time = Clock.getInstance().getTime() + generator.sample();
        Event e = new Event(type, time);
        list.add(e);
        return e;
    }
}