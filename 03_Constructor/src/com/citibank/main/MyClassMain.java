package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		MyClass myClass = new MyClass();
		
		myClass.show();
		System.out.println("-------------");
		
		new MyClass().show();
		new MyClass(3);
		new MyClass("Amol");
		System.out.println("Main end");
	}

}
