package com.citibank.main;

import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class DatabaseMain {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		Customer customer;
		System.out.println("Inserting customer into table...");
		customer = new Customer(1, "Nitesh", "Nawale");
		boolean chkFlag2 = customerService.addNewCustomer(customer);
		if(chkFlag2) {
			System.out.println("Customer inserted succeessfully..");
		}else {
			System.out.println("Customer not inserted...");
		}
		System.out.println("-----------------------------");
		
		System.out.println("Printing all Cust from List...");
		List<Customer> customerList = customerService.getAllCustomers();
		for (Customer customer1 : customerList) {
			System.out.println(customer1);
		}
		
		System.out.println("-----------------------------");
		
		customer = customerService.getCustomerByCustomerId(4);
		if (customer != null) {
			System.out.println("Single Customer details::" + customer);
		}else {
			System.out.println("Customer not found.....");
		}
		System.out.println("-----------------------------");
		customer = new Customer(4, "Ashwini", "pune");
		boolean chkFlag = customerService.updateCustomerByCustomerId(customer);
		if (chkFlag) {
			System.out.println("Customer updated successfully..");
		}else {
			System.out.println("Customer not updated, not found....");
		}
		System.out.println("-----------------------------");
		customer = customerService.getCustomerByCustomerId(4);
		if (customer != null) {
			System.out.println("Single Customer details::" + customer);
		}else {
			System.out.println("Customer not found.....");
		}
		System.out.println("-----------------------------");
		boolean chkFlag1 = customerService.deleteCustomerByCustomerId(1);
		if (chkFlag1) {
			System.out.println("Customer deleted successfully..");
		}else {
			System.out.println("Customer not deleted, not found....");
		}
		System.out.println("-----------------------------");
		customer = customerService.getCustomerByCustomerId(1);
		if (customer != null) {
			System.out.println("Single Customer details::" + customer);
		}else {
			System.out.println("Customer not found.....");
		}
	}

}
