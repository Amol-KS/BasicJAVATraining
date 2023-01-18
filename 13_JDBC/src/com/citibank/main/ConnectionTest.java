package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		System.out.println("Main Starts........");
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver loaded successfully...");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb","root","root");
			System.out.println("Connection Successfull....");
			
//			String sql = "insert into customer_Details(name,address) values(?,?)";
			String sql = "update customer_Details set name = ? where customer_Id = 2";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, "Aaradhya Shitole");
//			preparedStatement.setString(2, "Pune");
			int rowCount = preparedStatement.executeUpdate();
			if(rowCount > 0 ) System.out.println("Record inserted successfully...");
			else System.out.println("No Row inserted...");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Driver not found!!");
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main Ends........");

	}

}
