package com.citibank.main.domain;

public class Line extends Shapes {
	public Line() {
		System.out.println("Default const of Line");
	}
	
	public Line(int size) {
		System.out.println("Parameterized COnst of Line");
		System.out.println("Line Size :: " + size);
	}
	
	@Override
	public void draw() {
		System.out.println("Line Drawing");
	}

}
