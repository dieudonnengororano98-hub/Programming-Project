public class ArrivalProcessTest {
    public static void main(String[] args) { 
        EventList list = new EventList();
        ArrivalProcess arrivals = new ArrivalProcess(new Negexp(5, 42), EventType.ARRIVAL);
        Clock clock = Clock.getInstance();

        for (int i = 0; i < 10; i++) {
            Event e = arrivals.generateNext(list);
            clock.setTime(e.getTime());
        }
        list.print();
    }
}
