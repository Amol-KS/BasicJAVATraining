package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
	private double num1;
	private double num2;
	private double result;
	
	Scanner scanner = new Scanner(System.in);
	
	public void accept() {
		try {
		System.out.println("Enter first number:");
		num1 = scanner.nextDouble();
		System.out.println("Enter second number:");
		num2 = scanner.nextDouble();	
		}
		catch (InputMismatchException e) {
			System.out.println("INvalid Input from user-");
			System.out.println("Pgm will conti.....");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception in code!!");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("THank you");
		}
	}
	
	public void calculate() {
		System.out.println("Calculating results.....");
		result = num1 / num2;
	}
	
	public void display() {
		System.out.println("Result is:: " + result);
	}

}
