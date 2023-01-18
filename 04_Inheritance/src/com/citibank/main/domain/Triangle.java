package com.citibank.main.domain;

public class Triangle extends Shapes {
	public Triangle() {
		System.out.println("Default const of Traingle");
	}
	
	public Triangle(int size) {
		System.out.println("Parameterized COnst of Triangle");
		System.out.println("Triangle Size :: " + size);
	}
	
	@Override
	public void draw() {
		System.out.println("Trianlge Drawing");
	}

}
