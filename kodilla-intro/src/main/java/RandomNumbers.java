import java.util.Random;

public class RandomNumbers {
    int max;
    int[] myNumbers;

public RandomNumbers (int max) {
    this.myNumbers = new int[]{};
    }

    public int randomSomeNumbers () {
    Random random = new Random();
    int sum = 0;
    while (sum<=max) {
        int number = random.nextInt(31);
        sum = sum + number;
        this.myNumbers[myNumbers.length] = number;
    }
        return sum;

   //     for (int i = 0; i< myNumbers.length; i++) {
   //         System.out.println(myNumbers[i]);
        }

}
