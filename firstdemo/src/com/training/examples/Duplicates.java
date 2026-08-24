package com.training.examples;

public class Duplicates {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 10};

        int duplicateCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    duplicateCount++;
                    break;
                }
            }
        }

        System.out.println("Number of duplicate values: " + duplicateCount);
    }
}