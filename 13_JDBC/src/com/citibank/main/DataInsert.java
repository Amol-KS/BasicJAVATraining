package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DataInsert {

	public static void main(String[] args) {
		System.out.println("Main Starts........");
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver loaded successfully...");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb","root","root");
			System.out.println("Connection Successfull....");
			
			String sql = "insert into customer_Details(name,address) values(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			Scanner scanner = new Scanner(System.in);
			for (int i = 0; i < 3; i++) {
				System.out.println("Please enter name::");
				String enName = scanner.next();
				System.out.println("Enter address::");
				String enAddress = scanner.next();

				preparedStatement.setString(1, enName);
				preparedStatement.setString(2, enAddress);
				int rowCount = preparedStatement.executeUpdate();
				if (rowCount > 0)
					System.out.println("Record inserted successfully...");
				else
					System.out.println("No Row inserted...");
			}
			
			
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
