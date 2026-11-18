import java.util.Random;

public class AgeDistribution {
    public static void main(String[] args) {
        int[][] table = {
                {16, 20}, {34, 21}, {52, 22}, {68, 23}, {82, 24},
                {89, 25}, {94, 26}, {96, 28}, {98, 30}, {100, 35}
        };
        final int DRAWS = 1000;
        Random random = new Random();

        for (int run = 1; run <= 3; run++) {
            int[] counts = new int[36];

            for (int i = 0; i < DRAWS; i++) {
                int x = random.nextInt(100) + 1;
                int row = 0;
                while (x > table[row][0]) row++;
                counts[table[row][1]]++;
            }

            System.out.println("Run " + run + ":");
            for (int age = 0; age < counts.length; age++) {
                if (counts[age] > 0) {
                    System.out.printf("  age %d: %d (%.1f %%)%n",
                            age, counts[age], counts[age] * 100.0 / DRAWS);
                }
            }
        }
    }
}