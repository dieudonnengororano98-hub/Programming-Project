public class OrientationTask1_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            ServicePoint servicePoint = new ServicePoint();
            CustomerGenerator generator = new CustomerGenerator(servicePoint);
            generator.generate(5);
            servicePoint.serve();
            System.out.println("Average service time: " + servicePoint.getAverageServiceTime() + " ms");
        }
    }
}