package com.citibank.main.repository;

import java.util.List;

import com.citibank.main.domain.Customer;

public interface CustomerRepositoryInterface {
	public boolean addNewCustomer(Customer customer);
	public Customer getCustomerByCustomerId(int customerId);
	public List<Customer> getAllCustomers();
	public boolean updateCustomerByCustomerId(Customer customer);
	public boolean deleteCustomerByCustomerId(int customerId);
}
