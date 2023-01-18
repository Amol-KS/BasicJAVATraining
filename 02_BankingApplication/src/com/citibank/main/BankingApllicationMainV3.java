package com.citibank.main;

import java.util.Scanner;
import com.citibank.main.domain.Account;

public class BankingApllicationMainV3 {

	public static void main(String[] args) {
		System.out.println("Welcome to AKS Bank");
		Scanner scanner = new Scanner(System.in);
		Account account;

		int accountNumber;
		String name;
		double balance;
		char choice;
		double amount;
		String contCh;

		System.out.println("Enter AccountNumber:");
		accountNumber = scanner.nextInt();
		System.out.println("Enter Name:");
		scanner.nextLine();
		name = scanner.nextLine();
		System.out.println("Enter Balance:");
		balance = scanner.nextDouble();

//		account.setAccountNumber(accountNumber);
//		account.setName(name);
//		account.setBalance(balance);
		account = new Account(accountNumber, name, balance);
		
		System.out.println("Your account is opened successfully!!!");
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Name: " + account.getName());
		System.out.println("Balance: " + account.getBalance());

		System.out.println();
		do {
			showTransactionMenu(scanner, account);
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
