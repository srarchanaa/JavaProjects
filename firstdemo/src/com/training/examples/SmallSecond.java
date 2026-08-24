package com.training.examples;

public class SmallSecond {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 8, 2, 15, 3};

        int smallest = numbers[0];
        int secondSmallest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            }
            else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
                secondSmallest = numbers[i];
            }
        }

        System.out.println("Second smallest: " + secondSmallest);
    }
}