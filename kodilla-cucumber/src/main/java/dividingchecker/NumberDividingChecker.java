package dividingchecker;

public class NumberDividingChecker {
    public String dividingChecker(int number) {
        if (number % 3 == 0) {
             if (number % 5 == 0) {
                 return "FizzBuzz";
             }
             return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return "None";
    }
}
