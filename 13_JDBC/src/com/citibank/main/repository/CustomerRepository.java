package com.citibank.main.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.factory.ConnectionFactory;

public class CustomerRepository implements CustomerRepositoryInterface {
	private List<Customer> customerList = new ArrayList<>();
	private String sql;
	private PreparedStatement preparedStatement;
	private int rowCount;
	private ResultSet resultSet;
	private Connection connection;
	
	@Override
	public boolean addNewCustomer(Customer customer) {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connection = connectionFactory.getConnection();
		
		sql = "insert into customer_Details(name, address) values(?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			rowCount = preparedStatement.executeUpdate();
			
			if (rowCount > 0) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connection = connectionFactory.getConnection();
		
		sql = "select * from customer_Details where customer_id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				int custId = resultSet.getInt("customer_Id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				
				Customer customer = new Customer(custId, name, address);
				return customer;
			}
		} catch (SQLException e) {
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connection = connectionFactory.getConnection();
		
		sql = "select * from customer_Details";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				int customerID = resultSet.getInt("customer_Id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				
				Customer customer = new Customer(customerID, name, address);
				customerList.add(customer);
			}
		} catch (SQLException e) {
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return customerList;
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connection = connectionFactory.getConnection();
		
		sql = "update customer_Details set name = ? where customer_id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setInt(2, customer.getCustomerId());
			rowCount = preparedStatement.executeUpdate();
			
			if (rowCount > 0) {
				return true;
			}else {
				return false;
			}
				
		} catch (SQLException e) {
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connection = connectionFactory.getConnection();
		
		sql = "delete from customer_Details where customer_id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			rowCount = preparedStatement.executeUpdate();
			
			if (rowCount > 0) {
				return true;
			}else {
				return false;
			}
				
		} catch (SQLException e) {
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

}
