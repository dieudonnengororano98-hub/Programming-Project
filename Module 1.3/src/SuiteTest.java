public class SuiteTest {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        EventList list = new EventList();
        ServicePoint sp = new ServicePoint();
        ArrivalProcess arrivals = new ArrivalProcess(new Negexp(5, 7), EventType.ARRIVAL);

        for (int i = 0; i < 10; i++) {
            Event e = arrivals.generateNext(list);
            clock.setTime(e.getTime());
        }
        System.out.println("Time of the last event created: "
                + String.format("%.2f", clock.getTime()));

        while (!list.isEmpty()) {
            Event e = list.removeNext();
            Customer c = new Customer();
            c.setArrivalTime(e.getTime());
            sp.addToQueue(c);
        }

        clock.setTime(clock.getTime() + 5);

        while (sp.hasCustomers()) {
            Customer c = sp.serve();
            System.out.println("Customer " + c.getId() + " spent "
                    + String.format("%.2f", c.getTimeInSystem()) + " time units in the system");
        }
    }
}