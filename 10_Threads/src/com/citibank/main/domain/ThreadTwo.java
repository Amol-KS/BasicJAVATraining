package com.citibank.main.domain;

public class ThreadTwo implements Runnable{

	@Override
	public void run() {
		System.out.println("We are in ThreadTwo!!!");
		
	}
	
}
