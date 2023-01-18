package com.citibank.main;

import com.citibank.main.domain.ThreadOne;

public class ThreadOneMain {

	public static void main(String[] args) {
		System.out.println("Main Start....");
		ThreadOne threadOne = new ThreadOne();
		
		threadOne.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Main:::" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Main End....");
	}

}
