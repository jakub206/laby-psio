import java.util.Random;
public class Results {
    public static void main(String[] args) {
        int[] scores = new int[10];

        Random random = new Random();

        for (int i = 0; i < scores.length; i++) {
            scores[i] = random.nextInt(101);
        }

        /** Average result of exam **/
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        System.out.println("Average score: " + average);

        /** Min and max result **/
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("Maximum score: " + max);
        System.out.println("Minimum score: " + min);

        /** Amount of students who pass the exam **/
        int amount = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 51) {
                amount ++;
            }
        }
        System.out.println("Amount of students who passed the exam: " + amount);
    }
}
