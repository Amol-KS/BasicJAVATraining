package com.citibank.main.domain;

public abstract class Shapes {
	public Shapes() {
		System.out.println("Default COnst of Shapes");
	}
	
	public Shapes(int size) {
		System.out.println("Parameterized COnst of Shapes");
		System.out.println("Shape Size :: " + size);
	}
	
//	public void draw() {
//		System.out.println("Drawing shapes");
//	}
	public abstract void draw();
}
