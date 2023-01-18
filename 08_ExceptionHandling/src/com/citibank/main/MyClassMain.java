package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		MyClass myCLass = new MyClass();
		System.out.println("Main Starts :::");
		myCLass.accept();
		myCLass.calculate();
		myCLass.display();
		System.out.println("Main Ends :::");
	}

}
