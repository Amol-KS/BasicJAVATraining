package com.citibank.main.domain;

public class Circle extends Shapes {
	public Circle() {
		System.out.println("Default const of Circle");
	}
	
	public Circle(int size) {
		System.out.println("Parameterized COnst of Circle");
		System.out.println("Circle Size :: " + size);
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
