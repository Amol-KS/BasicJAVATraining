package com.citibank.main;

import com.citibank.main.domain.StaticVariables;

public class StaticVariableMain {
	int i1 = 10;
	static int i2 = 20;
	
	public static void main(String[] args) {
		int i3 = 10;
//		StaticVariables staticVariables = new StaticVariables();
//		staticVariables.display();
//		System.out.println("----------------------");
//		StaticVariables staticVariables1 = new StaticVariables();
//		staticVariables1.display();
		
//		StaticVariables.num2 = 500;
//		System.out.println(StaticVariables.num2);
//		
////		System.out.println(i1);
//		System.out.println(i2);
		
		System.out.println("Main Start");
		i3 = i3 + 4;
		System.out.println("Main End");
		
	}

}
