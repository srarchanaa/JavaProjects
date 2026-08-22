package com.training.arrays;

public class SumArray {
	public static void main(String[] args) {
		int[] nums = new int[4];
		System.out.println(nums.length); //4
		System.out.println(nums[3]);  //0
		// System.out.println(nums[4]);  //throws AIOOBEXCEP

		nums[0]=10;nums[1]=20;nums[2]=30;nums[3]=40;
		int sum = 0;
		for(int i=0; i<nums.length; i++) {
			int val = nums[i];
			sum += nums[i];
			System.out.println(val);
		}
		System.out.println("Sum of the Array is : " + sum);
		
		int total = 0;
		
		for(int item:nums) {
			total = total + item;
			
		}
		
		System.out.println("Sum of the Array" + total);
		
		String[] names = new String[] {"Priya","Jay","Anu","Sai"};
		for(String name:names) {
			System.out.println(name.toUpperCase());
			
		}
		
	}

}
