package com.citibank.main;

import java.util.HashSet;
import java.util.Set;

import com.citibank.main.domain.Customer;

public class CustomerMainV3 {

	public static void main(String[] args) {
		Set<Customer> customerSet = new HashSet<>();
		
		Customer cust1 = new Customer(101,"Amol","Pune");
		Customer cust2 = new Customer(102,"Aary","Mumbai");
		Customer cust3 = new Customer(103,"Aaradhy","Himachal");
		Customer cust4 = new Customer(104,"Keshav","JandK");
		Customer cust5 = new Customer(105,"Vaijanta","Ladhak");	
		Customer cust6 = new Customer(105,"Vaijanta","Ladhak");
		
		System.out.println("CUst1::" + cust1.hashCode());
		System.out.println("Adding Cust1::: " + customerSet.add(cust1));
//		System.out.println("Adding Cust2::: " + customerSet.add(cust2));
//		System.out.println("Adding Cust3::: " + customerSet.add(cust3));
//		System.out.println("Adding Cust4::: " + customerSet.add(cust4));
		System.out.println("CUst5::" + cust5.hashCode());
		System.out.println("Adding Cust5::: " + customerSet.add(cust5));
		System.out.println("CUst6::" + cust6.hashCode());
		System.out.println("Adding Cust6::: " + customerSet.add(cust6));
//		
//		System.out.println(customerSet);
	}

}
