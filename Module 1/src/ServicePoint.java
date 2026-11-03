import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>(); 
    private long totalServiceTime = 0;
    private int servedCount = 0;

    public void addToQueue(Customer a) {
        a.setStartTime(System.currentTimeMillis());
        queue.addFirst(a);
    }

    public Customer removeFromQueue() {
        return queue.removeLast();
    }

    public void serve() {
        while (!queue.isEmpty()) {
            Customer c = removeFromQueue();
            long serviceTime = (long) (Math.random() * 500);

            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            c.setEndTime(System.currentTimeMillis());
            totalServiceTime = totalServiceTime + serviceTime;
            servedCount++;

            System.out.println("Customer " + c.getId() + " response time: " + c.getTimeSpent()
                    + " ms, service time: " + serviceTime + " ms");
        }
    }

    public double getAverageServiceTime() {
        return (double) totalServiceTime / servedCount;
    }
}
