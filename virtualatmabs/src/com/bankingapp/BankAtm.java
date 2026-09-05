package com.bankingapp;

import java.util.Scanner;

public class BankAtm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(Account.BANKNAME);
		Account.documentsNeeded();
		System.out.println(Account.idProof);
		
		
		
		System.out.println("Choose \'s\' for savings and \'c\' for current");
		String choice = scanner.next();
		Account account = null;
		if(choice.equalsIgnoreCase("S"))
			//super class ref = sub class object
			account = new Savings(20000);
		else {
			account = new Current(10000, "Current");
		    //create a ref of Current and downcast
			Current current = (Current)account;
			//call own method of current
			String[] loans = current.showLoanTypes();
			for (String loan : loans) {
				System.out.println(loan);
			}
		}
		
		account.printInfo();
		
		for(;;) {	
        //class the overridden methods using account ref
		System.out.println(
				"""
				Enter any below option:
				\n 1. Withdraw
				\n 2. Deposit
				\n 3. Balance
				\n 4. Exit
				\n
				""");
		int type = scanner.nextInt();
		switch(type) {
		case 1:
			System.out.println("Enter Amount to withdraw : \n");
			double amount = scanner.nextDouble();
			account.withdraw(amount);
			break;
		case 2:
			System.out.println("Enter Amount to deposit: \n");
			double amount1 = scanner.nextDouble();
			account.deposit(amount1);
			break;
		case 3:
			System.out.println("Balance is "+ account.getBalanace());
			break;
		case 4:
		default:
			scanner.close();
			System.exit(0);
		}
		}	
	
	}


	}
