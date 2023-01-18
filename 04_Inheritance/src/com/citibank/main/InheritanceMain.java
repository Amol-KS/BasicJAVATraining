package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Circle;
import com.citibank.main.domain.Line;
import com.citibank.main.domain.Shapes;
import com.citibank.main.domain.Triangle;

public class InheritanceMain {

	public static void main(String[] args) {
//		Circle circle = new Circle(10);
//		circle.draw();
//		
//		Shapes shapes = new Circle();
//		shapes.draw();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Circle   2.Triangle  3.Line");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		
		Shapes shapes = getShape(choice);
		shapes.draw();
			
	}
	
	public static Shapes getShape(int choice) {
		if(choice == 1) {
			Shapes shapes = new Circle();
			return shapes;
		}
		if(choice == 2) {
			return new Triangle();
		}
		if(choice == 3) {
			return new Line();
		}
		return null;
	}

}
