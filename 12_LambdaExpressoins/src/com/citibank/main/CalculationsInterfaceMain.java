package com.citibank.main;

import com.citibank.main.domain.CalculationsInterface;

public class CalculationsInterfaceMain {

	public static void main(String[] args) {
		CalculationsInterface Addition = (a,b) -> {
			return a + b;
		};
		
		CalculationsInterface Subtraction = (a,b) -> {
			return a - b;
		};
		CalculationsInterface Multiplication = (a,b) -> {
			return a * b;
		};
		
		CalculationsInterface Division = (a,b) -> {
			return a / b;
		};
	
		System.out.println(Multiplication.doCalculations(2, 3));
	}

}
