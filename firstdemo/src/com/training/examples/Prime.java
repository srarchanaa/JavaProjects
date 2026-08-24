package com.training.examples;

public class Prime {

    public static void main(String[] args) {

        for (int number = 2; number <= 100; number++) {

            boolean prime = true;

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(number + " ");
            }
        }
    }
}
