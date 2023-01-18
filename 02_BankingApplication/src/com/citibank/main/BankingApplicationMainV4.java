package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.Savings;

public class BankingApplicationMainV4 {

	public static void main(String[] args) {
		System.out.println("Welcome to AKS Bank");
		Scanner scanner = new Scanner(System.in);
		Savings savings;

		int accountNumber;
		String name;
		double balance;
		char choice;
		double amount;
		String contCh;
		boolean isSalary;

		System.out.println("Enter AccountNumber:");
		accountNumber = scanner.nextInt();
		System.out.println("Enter Name:");
		scanner.nextLine();
		name = scanner.nextLine();
		System.out.println("Enter Balance:");
		balance = scanner.nextDouble();
		System.out.println("Do you want to open Saving account");
		isSalary = scanner.nextBoolean();
		
		
//		account.setAccountNumber(accountNumber);
//		account.setName(name);
//		account.setBalance(balance);
		savings = new Savings(accountNumber, name, balance, isSalary);

		System.out.println("Your account is opened successfully!!!");
		System.out.println("Account Number: " + savings.getAccountNumber());
		System.out.println("Name: " + savings.getName());
		System.out.println("Balance: " + savings.getBalance());
		System.out.println("Is Salary account: " + savings.isSalary());

		System.out.println();
		do {
			showTransactionMenu(scanner, savings);
			System.out.println("Do you want to continue?");
			contCh = scanner.next();
		} while (contCh.equalsIgnoreCase("yes") || contCh.equalsIgnoreCase("y"));

		System.out.println("Thanks for Banking with us....");
	}

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
