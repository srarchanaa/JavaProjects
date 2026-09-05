package com.bankingapp;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	void withdraw(double amount) {
		System.out.println("Withdraw in Savings");
		balance = balance - amount;
	}
	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Deposit in Savings");
		balance = balance + amount;
		
	}
	
	

}
