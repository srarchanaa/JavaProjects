package com.oops.basics;

public class CalculatorDemo {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();

      
        int[] nums1 = {10, 20, 30};
        int[] nums2 = {10, 20, 30, 50};
        int[] nums3 = {10, 20, 30, 40, 50};
        calculator.sum(nums1);
        calculator.sum(nums2);
        calculator.sum(nums3);

        
        double result = calculator.square(5);
        System.out.println("Square = " + result);
		
	}

}
