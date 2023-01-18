package com.citibank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		Customer cust1 = new Customer(101,"Amol","Pune");
		Customer cust2 = new Customer(102,"Aary","Mumbai");
		Customer cust3 = new Customer(103,"Aaradhy","Himachal");
		Customer cust4 = new Customer(104,"Keshav","JandK");
		Customer cust5 = new Customer(105,"Vaijanta","Ladhak");		
		
		List<Customer> customerList = new ArrayList<>();
		
		customerList.add(cust1);
		customerList.add(cust2);
		customerList.add(cust3);
		customerList.add(cust4);
		customerList.add(cust5);
		
		printAllCustomers(customerList);
		
		Scanner scanner = new Scanner(System.in);
//		int customerId;
//		System.out.println("Enter Customer ID:::");
//		customerId = scanner.nextInt();
//		
//		printCustomerByCustomerID(customerList, customerId);
		
//		int customerId;
//		String name, address;
//		System.out.println("Enter Customer ID:::");
//		customerId = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("Enter New name:::");
//		name = scanner.nextLine();
//		scanner.nextLine();
//		System.out.println("Enter New Address:::");
//		address = scanner.nextLine();
//		
//		Customer updateCustomer = new Customer(customerId, name, address);
//		updateCustomerByCustomerID(customerList, updateCustomer);
//		
//		printAllCustomers(customerList);
		
		int customerId;
		System.out.println("Enter Customer ID to delete:::");
		customerId = scanner.nextInt();
		
		deleteCustomerByCustomerID(customerList, customerId);
		printAllCustomers(customerList);
	}
	
	private static void deleteCustomerByCustomerID(List<Customer> customerList, int customerId) {
		boolean flag = false;
		for (Customer customer : customerList) {
			if(customerId == customer.getCustomerId()) {
				System.out.println("Matched customerId:::" + customer);
				customerList.remove(customer);
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("No customer found for given customerId");
		}
	}
	
	private static void updateCustomerByCustomerID(List<Customer> customerList, Customer customer) {
		boolean flag = false;
		for (Customer c : customerList) {
			if(c.getCustomerId() == customer.getCustomerId()) {
//				System.out.println("Matched customerId:::" + customer);
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				flag = true;
				System.out.println("Customer updated successfully:::");
				break;
			}
		}
		if(flag == false) {
			System.out.println("No customer found for given customerId");
		}
	}
	
	private static void printCustomerByCustomerID(List<Customer> customerList, int customerId) {
		boolean flag = false;
		for (Customer customer : customerList) {
			if(customerId == customer.getCustomerId()) {
				System.out.println("Matched customerId:::" + customer);
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("No customer found for given customerId");
		}
	}
	
	private static void printAllCustomers(List<Customer> customerList) {
		System.out.println("All Customers...");
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
	}

}
