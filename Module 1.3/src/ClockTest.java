public class ClockTest {
    public static void main(String[] args) {
        Clock a = Clock.getInstance();
        Clock b = Clock.getInstance();
        System.out.println("Same object? " + (a == b));
        a.setTime(12.5);
        System.out.println("Time through b: " + b.getTime());
    }
}