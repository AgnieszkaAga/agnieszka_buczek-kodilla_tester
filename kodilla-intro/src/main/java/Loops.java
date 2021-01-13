public class Loops {
    public static void main(String[] args) {
        int[] myNumbers = new int[] {1, 2, 3};
        Loops id = new Loops();
        int result = id.sumOfNumbers(myNumbers);
        System.out.println(result);
    }

    public int sumOfNumbers(int[] myNumbers) {
        int sum = 0;
        for (int i = 0; i < myNumbers.length; i++) {
            sum = sum + myNumbers[i];
        }
        return sum;
    }
}