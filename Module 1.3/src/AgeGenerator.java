import java.util.Random;

public class AgeGenerator {
    private final int[] ages   = {19, 20, 21, 22, 23, 24, 25};
    private final int[] counts = { 2,  5,  7,  5,  3,  2,  1}; 
    private final int[] cumulative = new int[counts.length];
    private final int total;
    private final Random random;

    public AgeGenerator(long seed) {
        random = new Random(seed);
        int sum = 0;
        for (int i = 0; i < counts.length; i++) {
            sum += counts[i];
            cumulative[i] = sum;
        }
        total = sum;
    }

    public int nextAge() {
        int r = random.nextInt(total) + 1;
        for (int i = 0; i < cumulative.length; i++) {
            if (r <= cumulative[i]) return ages[i];
        }
        return ages[ages.length - 1];
    }

    public static void main(String[] args) {
        long[] seeds = {1, 2, 3};
        for (long seed : seeds) {
            AgeGenerator gen = new AgeGenerator(seed);
            int[] result = new int[gen.ages.length];
            for (int n = 0; n < 1000; n++) {
                int age = gen.nextAge();
                for (int i = 0; i < gen.ages.length; i++)
                    if (gen.ages[i] == age) result[i]++;
            }
            System.out.println("Run with seed " + seed + ":");
            for (int i = 0; i < gen.ages.length; i++) {
                double expected = 1000.0 * gen.counts[i] / gen.total;
                System.out.println("  age " + gen.ages[i] + ": " + result[i]
                        + " (expected about " + expected + ")");
            }
        }
    }
}
