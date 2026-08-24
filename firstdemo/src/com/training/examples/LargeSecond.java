package com.training.examples;

public class LargeSecond {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 8, 2, 15, 3};

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            }
            else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Second largest: " + secondLargest);
    }
}