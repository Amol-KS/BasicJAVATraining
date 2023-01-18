package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.Current;
import com.citibank.main.domain.Savings;

public class BankingApplicationMainV6 {

	public static void main(String[] args) {
		System.out.println("Welcome to AKS Bank");
		int accChoice, accountNumber;
		String name, contCh;
		double balance, overDraftLimit;
		boolean isSalary;
		
		Scanner scanner = new Scanner(System.in);
		Account account;
		
		System.out.println("Account Menu ::");
		System.out.println("1.Saving   2.Current ");
		System.out.println("Enter your Account choice:---");
		accChoice = scanner.nextInt();
		
			
		System.out.println("Enter AccountNumber:");
		accountNumber = scanner.nextInt();
		System.out.println("Enter Name:");
		scanner.nextLine();
		name = scanner.nextLine();
		System.out.println("Enter Balance:");
		balance = scanner.nextDouble();
		
		if(accChoice == 1) {
			System.out.println("Do you want to open Salary account");
			isSalary = scanner.nextBoolean();
			account = new Savings(accountNumber, name, balance, isSalary);
		}
		else {
			if (accChoice == 2) {
				System.out.println("Please enter Overdraft limit:");
				overDraftLimit = scanner.nextDouble();
				account = new Current(accountNumber, name, balance, overDraftLimit);
			}
			else {
				account = null;
			}
		}
		System.out.println("Account opnened Successsully....");
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		
		if(accChoice == 1) {
			Savings savings = (Savings) account;
			System.out.println("Is Salary:" + savings.isSalary());
		}
		else {
			Current current = (Current) account;
			System.out.println("Overdragt limit::" + current.getOverDraftLimit());
		}
		
		System.out.println();
		do {
			showTransactionMenu(scanner, account);
			System.out.println("Do you want to continue?");
			contCh = scanner.next();
		} while (contCh.equalsIgnoreCase("yes") || contCh.equalsIgnoreCase("y"));

		System.out.println("Thanks for Banking with us....");
	}
//	public static Account getChoice(int accChoice,int ) {
//		if(accChoice == 1) {
//			return new Savings(accountNumber, name, balance, isSalary);
//		}
//		if(accChoice == 2) {
//			return new Current();
//		}
//		return null;
//	}
	
	private static void showTransactionMenu(Scanner scanner, Account account) {
		char choice;
		double amount;
		System.out.println("Transaction Menu:-");
		System.out.println("Press 1, For Withdraw");
		System.out.println("Press 2, For Deposite");
		System.out.println("Press 3, For Check balance");
		System.out.println("Press 4, For Exit");

		System.out.println("Enter your choice");
		choice = scanner.next().charAt(0);

		switch (choice) {
		case '1':
			System.out.println("Enter amount to Withdraw:");
			amount = scanner.nextDouble();
			if (account.withdraw(amount))
				System.out.println("Withdrawal succ.....");
			else
				System.out.println("Withdraw failed....");
			break;

		case '2':
			System.out.println("Enter amount to Deposite:");
			amount = scanner.nextDouble();
			if (account.deposit(amount))
				System.out.println("Deposite succ.....");
			else
				System.out.println("Deposite failed....");
			break;

		case '3':
			System.out.println("Checking balance:");
			System.out.println(account.getBalance());
			break;

		case '4':
			System.exit(0);
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
}
