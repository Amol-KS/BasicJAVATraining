package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.MyClass;
import com.citibank.main.domain.MyInterface;
import com.citibank.main.domain.YourClass;
import com.citibank.main.factory.MyFactory;

public class MyClassMain {

	public static void main(String[] args) {
		MyInterface myInterface;
		System.out.println("Main Starts!!");
		
		MyClass myClass = new MyClass();
		myClass.show();
		
		System.out.println("------------------");
		myInterface = new MyClass();
		myInterface.show();
		System.out.println("------------------");
		myInterface = new YourClass();
		myInterface.show();
		System.out.println("------------------");
		
		System.out.println(MyInterface.message);
		System.out.println(MyClass.message);
		System.out.println("------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.MyCLass Object ");
		System.out.println("2.YourClass object ");
		System.out.println("Enter your choice---");
		int choice = scanner.nextInt();
		
		myInterface = MyFactory.getObject(choice);
		
		if(myInterface != null)
			myInterface.show();
		else
			System.out.println("Invalid CHoice");
		
		System.out.println("------------------");
		System.out.println("Main Ends!!");

	}

}
