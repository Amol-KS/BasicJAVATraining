package com.citibank.main.domain;

public class AccountThread implements Runnable{
	private Account account;
	private double balance;
	private double amount;
	private int isChoice;
	
	
	public AccountThread( Account account, double balance, double amount, int isChoice) {
		super();
		this.account = account;
		this.balance = balance;
		this.amount = amount;
		this.isChoice = isChoice;
	}


	@Override
	public void run() {
		if(isChoice == 1) account.withdraw(balance, amount);
		else account.deposite(balance, amount);
		
	}
	
}
