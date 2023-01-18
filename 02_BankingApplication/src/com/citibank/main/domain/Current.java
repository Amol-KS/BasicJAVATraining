package com.citibank.main.domain;

public class Current extends Account {
	private double overDraftLimit , totalBalance, testBalance;
	
	public Current() {
		System.out.println("Default const for Current");
	}

	public Current(int accountNumber, String name, double balance, double overDraftLimit) {
		super(accountNumber, name, balance);
		totalBalance = overDraftLimit;
		this.overDraftLimit = overDraftLimit;
		System.out.println("Parameterized Default const for Current");
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	@Override
	public boolean withdraw(double amount) {
		testBalance = getBalance() + overDraftLimit;
		if(amount <= testBalance) {
			if(amount <= getBalance()) {
				setBalance(getBalance() - amount);
				return true;
			}
			else {
				testBalance = amount - getBalance();
				setBalance(0);
				overDraftLimit = overDraftLimit - testBalance; 
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean deposit(double amount) {
		if (overDraftLimit < totalBalance) {
			testBalance = overDraftLimit + amount;
			if (testBalance > totalBalance) {
				testBalance = testBalance - totalBalance;
				overDraftLimit = totalBalance;
				setBalance(getBalance() + testBalance);
				return true;
			} 
			else {
				overDraftLimit = testBalance;
				return true;
			}
		} 
		else {
			setBalance(getBalance() + amount);
			return true;
		}
	}
}
