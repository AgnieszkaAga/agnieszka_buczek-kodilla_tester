package org.agnieszka.random;

import java.util.Random;

public class RandomNumbers {
    int sumOfAllNumbers;
    int[] myNumbers;
    int loops;

    public RandomNumbers(int aMax) {
        this.myNumbers = new int[aMax];
        this.sumOfAllNumbers = aMax;
        this.loops = 0;
    }

    public int randomSomeNumbers() {
        Random random = new Random();
        int sum = 0;

        while (sum <= sumOfAllNumbers) {
            int number = random.nextInt(31);
            sum = sum + number;
            this.myNumbers[loops] = number;
            loops++;
        }
        return loops;
    }

    public int getMax(){
        int max = myNumbers[0];
        for (int i = 0; i < loops; i++){
            if (max < myNumbers[i])
                max = myNumbers[i];
        }
        return max;
    }

    public int getMin(){
        int min = myNumbers[0];
        for (int i = 0; i < loops; i++){
            if (min > myNumbers[i])
                min = myNumbers[i];
        }
        return min;
    }

    public void showNumbers() {
        for (int i = 0; i < loops; i++){
            System.out.println(myNumbers[i]);
        }
    }
}
