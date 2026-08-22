package com.training.examples;

//cntrl + D to delete a line
//shift+cntrl+o to import classes
//shift+cntrl+f format the calss

public class Greater {
	public static void main(String[] args) {
		//create three nums
		int x=10;
		int y=20;
		int z=30;
		if(x>y && x>z) {
			System.out.println("x is greater than y and z");
		}	
		else if(y>z)  {
			System.out.println("y is greater than x and z");
		}
		else {
			System.out.println("z is greater than x and y");
		}	
		
	}

}


