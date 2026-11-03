import java.util.LinkedList;

public class ServicePoint {
    private final LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueue(Customer c) { queue.add(c); }

    public Customer serve() {
        Customer c = queue.poll();
        if (c != null) c.setRemovalTime(Clock.getInstance().getTime());
        return c;
    }

    public boolean hasCustomers() { return !queue.isEmpty(); }
}