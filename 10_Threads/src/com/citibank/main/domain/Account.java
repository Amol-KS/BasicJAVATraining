package com.citibank.main.domain;

public class Account {
	private double balance;
	private double amount;
	
	public Account(double balance, double amount) {
		super();
		this.balance = balance;
		this.amount = amount;
	}

	public void withdraw(double balance, double amount) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance = balance - amount;
		System.out.println("Balance after Withdraw:: " + balance);
	}
	
	public void deposite(double balance, double amount) {
		balance = balance + amount;
		System.out.println("Balance after Deposite:: " + balance);
	}

}
