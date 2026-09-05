package com.bankingapp;

public class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	void withdraw(double amount) {
		System.out.println("Withdrawing");
	}
	void deposit(double amount) {
		System.out.println("Depositing");
	}
	double getBalanace() {
		return balance;
	}
	

}
