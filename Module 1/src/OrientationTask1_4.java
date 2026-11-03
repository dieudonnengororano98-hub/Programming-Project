import java.util.LinkedList;
import java.util.Scanner;

public class OrientationTask1_4 {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        while (!choice.equals("e")) {
            System.out.print("q = queue, d = dequeue, e = exit: ");
            choice = scanner.nextLine();

            if (choice.equals("q")) {
                Customer c = new Customer();
                c.setStartTime(System.nanoTime());
                queue.addFirst(c);
            } else if (choice.equals("d")) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty");
                } else {
                    Customer c = queue.removeLast();
                    c.setEndTime(System.nanoTime());
                    System.out.println("Customer " + c.getId() + " time in queue: " + c.getTimeSpent() + " ns");
                }
            }
        }
    }
}