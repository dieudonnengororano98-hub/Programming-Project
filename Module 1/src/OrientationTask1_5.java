public class OrientationTask1_5 {
    public static void main(String[] args) { 
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator generator = new CustomerGenerator(servicePoint);
        generator.generate(5);
        servicePoint.serve();
    }
}
