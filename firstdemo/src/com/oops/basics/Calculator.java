package com.oops.basics;

public class Calculator {
	
	//usage of var args
	void sum(int...nums) {
		int sum = 0;

        // Iterate through the array and calculate sum
        for (int num : nums) {
            sum = sum + num;
        }

        System.out.println("Sum = " + sum);
		
	}
	double square(int a) {
		//calculate square using inbuilt method of Math class
		 return Math.pow(a, 2);
	}

}
