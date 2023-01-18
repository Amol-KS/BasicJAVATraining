package com.citibank.main.domain;

public class StaticVariables {
	int num1 = 10; 
	public static int num2 = 10;
	
	public StaticVariables() {
		System.out.println("Default constructor");
	}
	
	static {
		System.out.println("Static call");
	}
	
	{ System.out.println("Non static call");
	}
	
	public void display(){
		System.out.println("Num1:" + num1);
		System.out.println("Num2:" + num2);
		num1 = num1 + 10;
		num2 = num2 + 10;
		System.out.println("Num1:" + num1);
		System.out.println("Num2:" + num2);
	}

}
