package com.citibank.main.domain;

public class Resource {
	public synchronized void message(String textMessage) {
		System.out.print("[");
		System.out.print(textMessage);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
