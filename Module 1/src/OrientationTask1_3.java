public class OrientationTask1_3 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setStartTime(10);
        c1.setEndTime(25);
        System.out.println(c1.getId() + " " + c1.getTimeSpent());

        Customer c2 = new Customer();
        c2.setStartTime(100);
        c2.setEndTime(150);
        System.out.println(c2.getId() + " " + c2.getTimeSpent());
    }
}