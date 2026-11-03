public class CustomerGenerator {
    private ServicePoint servicePoint;

    public CustomerGenerator(ServicePoint servicePoint) {
        this.servicePoint = servicePoint;
    }

    public void generate(int count) {
        for (int i = 0; i < count; i++) {
            servicePoint.addToQueue(new Customer());
        }
    }
}