package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DataDelete {

	public static void main(String[] args) {
		System.out.println("Main Starts........");
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver loaded successfully...");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb","root","root");
			System.out.println("Connection Successfull....");
			
			String sql = "delete from customer_Details where customer_Id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please enter Id to delete::");
			int enId = scanner.nextInt();
			
			preparedStatement.setInt(1, enId);
	
			int rowCount = preparedStatement.executeUpdate();
			if (rowCount > 0)
				System.out.println("Record deleted successfully...");
			else
				System.out.println("No Row inserted...");
			
			
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
