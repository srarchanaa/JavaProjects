package com.oops.basics;

public class Greeter {
	
	void printMessage(String...names) {
		//iterate and print the messages as "Great Day, PRIYA!!!"
		for (String name : names) {
            System.out.println("Great Day, " + name.toUpperCase() + "!!!");
        }
	}
	
	void printMessageWithGreets(String name, String...messages) {
		//iterate thru messages and print as "message 1", + name --> Hello Priya, Welcome Priya, Bye Bye Priya
		for (String message : messages) {
            System.out.println(message + " " + name);
        }
	}
	
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();

        // First method
		// String[] name = {"Priya", "Rahul", "Arun"};
        greeter.printMessage("Priya", "Rahul", "Arun");
       

        // Second method
        // String[] greets = { "Hello", "Welcome", "Bye Bye"};
        greeter.printMessageWithGreets("Priya","Hello", "Welcome", "Bye Bye");
		
	}

}
