public class Customer {
    private static int nextId = 1;
    private final int id;
    private double arrivalTime;
    private double removalTime;

    public Customer() { id = nextId++; }

    public int getId()                    { return id; }
    public void setArrivalTime(double t)  { arrivalTime = t; }
    public void setRemovalTime(double t)  { removalTime = t; }
    public double getTimeInSystem()       { return removalTime - arrivalTime; }
}