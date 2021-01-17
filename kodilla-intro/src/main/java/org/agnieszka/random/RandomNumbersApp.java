package org.agnieszka.random;

public class RandomNumbersApp {
    public static void main(String[] args) {
        RandomNumbers firstSet = new RandomNumbers(100);
        firstSet.randomSomeNumbers();
        int max = firstSet.getMax();
        int min = firstSet.getMin();
        System.out.println(max);
        System.out.println(min);
        firstSet.showNumbers();
    }
}

