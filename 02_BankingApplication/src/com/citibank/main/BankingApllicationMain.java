package com.citibank.main;

import com.citibank.main.domain.Account;

public class BankingApllicationMain {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setAccountNumber(300);
		System.out.println(account.getAccountNumber());
		
		account.setBalance(3);
		System.out.println(account.getBalance());
		
		account.deposit(100);
		System.out.println(account.getBalance());

	}
}
