public class RandomNumbersApp {
    public static void main(String[] args) {
        RandomNumbers firstSet = new RandomNumbers(5000);
        int result = firstSet.randomSomeNumbers();

        System.out.println(result);
        }
    }

