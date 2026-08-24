package com.training.arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] numbers = {50, 20, 40, 10, 30};

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {

                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Ascending order:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
