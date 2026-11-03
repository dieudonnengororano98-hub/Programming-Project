import java.util.Random;

public class Negexp {
    private final double mean;
    private final Random random;

    public Negexp(double mean, long seed) {
        this.mean = mean;
        this.random = new Random(seed);
    }

    public double sample() {
        return -mean * Math.log(1 - random.nextDouble());
    }
}