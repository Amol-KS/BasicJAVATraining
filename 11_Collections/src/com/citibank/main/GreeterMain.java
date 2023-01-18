package com.citibank.main;

import com.citibank.main.domain.GoodMorningGreeter;
import com.citibank.main.domain.Greeter;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter greeter = new GoodMorningGreeter();

		greeter.greet();
		
		Greeter goodEvenGreeter = new Greeter() {
			
			@Override
			public void greet() {
				System.out.println("Good Evening!!!");				
			}
		};
		goodEvenGreeter.greet();
		
		System.out.println("----------------------");
		Greeter lamdaGreet = () -> {
			System.out.println("Good morning, good afternoon, good evening...");
		};
		
		lamdaGreet.greet();
		
		Runnable runnable = () -> System.out.println("I am in THread");
		Thread thread = new Thread(runnable);
		thread.start();
		
		System.out.println("----------------------");
		
	}

}
