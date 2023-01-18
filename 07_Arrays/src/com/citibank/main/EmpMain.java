package com.citibank.main;

import java.util.Iterator;
import java.util.Scanner;

import com.citibank.main.domain.Emp;

public class EmpMain {

	public static void main(String[] args) {
		Emp emp1 = new Emp(301, "Amol", 1000);
		Emp emp2 = new Emp(302, "Aaradhy", 2000);
		Emp emp3 = new Emp(303, "Aary", 3000);
		Emp emp4 = new Emp(304, "Ashwini", 4000);
		Emp emp5 = new Emp(305, "Keshav", 5000);
		
		System.out.println("----------------------");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		System.out.println("----------------------");
		
		Emp [] allEmp = new Emp[5];
		Scanner scanner = new Scanner(System.in);
		int empID;
		String name;
		double salary;
		for (int i = 0; i < allEmp.length; i++) {
			System.out.println("Enter EmpID::");
			empID = scanner.nextInt();
			System.out.println("Enter Name::");
			name = scanner.next();
			System.out.println("Enter Salary::");
			salary = scanner.nextDouble();
			Emp emp = new Emp(empID, name, salary);
			allEmp[i] = emp;
			System.out.println();
		}
		
		System.out.println("All EMployees :::");
		for (Emp emp : allEmp) {
			System.out.println(emp);
		}
	}

}
