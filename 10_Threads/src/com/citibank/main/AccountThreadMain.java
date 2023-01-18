package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.AccountThread;

public class AccountThreadMain {

	public static void main(String[] args) {
		double balance = 50000;
		double amount;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter Amount to withdraw::");
		amount = scanner.nextDouble();
		
		Account account1 = new Account(balance, amount);
		AccountThread accountThread = new AccountThread(account1,balance, amount, 1);
		
		Thread thread1 = new Thread(accountThread);
		thread1.start();
		
//		amount = amount - 500;
		System.out.println("Amount to Deposite::" + amount);
		
		
		Account account2 = new Account(balance, amount);
		AccountThread accountThread2 = new AccountThread(account2,balance, amount, 2);
		
		Thread thread2 = new Thread(accountThread2);
		thread2.start();

	}

}
