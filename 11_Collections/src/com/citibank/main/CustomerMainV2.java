package com.citibank.main;

import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class CustomerMainV2 {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerService();
		
		System.out.println("Adding Customers....");
		Customer cust1 = new Customer(101,"Amol","Pune");
		Customer cust2 = new Customer(102,"Aary","Mumbai");
		Customer cust3 = new Customer(103,"Aaradhy","Himachal");
		Customer cust4 = new Customer(104,"Keshav","JandK");
		Customer cust5 = new Customer(105,"Vaijanta","Ladhak");		
		
		System.out.println("Adding Cust1::: " + customerService.addNewCustomer(cust1));
		System.out.println("Adding Cust2::: " + customerService.addNewCustomer(cust2));
		System.out.println("Adding Cust3::: " + customerService.addNewCustomer(cust3));
		System.out.println("Adding Cust4::: " + customerService.addNewCustomer(cust4));
		System.out.println("Adding Cust5::: " + customerService.addNewCustomer(cust5));
		
		System.out.println("----------------------");
		System.out.println("Printing all Cust from List...");
		List<Customer> customerList = customerService.getAllCustomers();
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
		System.out.println("----------------------");
		Customer customer = customerService.getCustomerByCustomerId(102);
		System.out.println(customer);
		
		System.out.println("----------------------");
		Customer customerUpdated = new Customer(103,"Vandip","Ranje");
		System.out.println("New Cust::" + customerUpdated);
		boolean result = customerService.updateCustomerByCustomerId(customerUpdated);
		if(result) 
			System.out.println("Updated Successfully");
		else
			System.out.println("No customer found!!!");
		
		System.out.println("Updated Cust::" + customerService.getCustomerByCustomerId(103));
		System.out.println("----------------------");
		boolean delFlag = customerService.deleteCustomerByCustomerId(103);
		if(delFlag)
			System.out.println("Deleted successfully");
		else
			System.out.println("No cust found!!!");
		
		List<Customer> customerList1 = customerService.getAllCustomers();
		for (Customer customer1 : customerList1) {
			System.out.println(customer1);
		}
		System.out.println("----------------------");
	}

}
