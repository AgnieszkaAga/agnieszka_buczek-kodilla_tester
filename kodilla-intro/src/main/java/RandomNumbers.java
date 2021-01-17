import java.util.Random;

public class RandomNumbers {
    int max;
    int[] myNumbers;
    int loops;

    public RandomNumbers(int max) {
        this.loops = 0;
        this.myNumbers = new int[max];
    }

    public int randomSomeNumbers() {
        Random random = new Random();
        int sum = 0;
        int loops = 0;
        while (sum <= max) {
            int number = random.nextInt(31);
            sum = sum + number;
            this.myNumbers[loops] = number;
            loops++;
        }
        return loops;
    }

    }
