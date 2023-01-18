package com.citibank.main.domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class ReadMyFile {
	private String path = "C:\\Amol_Java\\JavaTest.txt";
	private InputStream inputStream;
	private byte[] data = new byte[100];
	
	public void readFile() {
		try {
			inputStream = new FileInputStream(path);
			inputStream.read(data);
			for (byte b : data) {
				System.out.println((char)b);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error in reading file!!!");
			e.printStackTrace();
		}
		finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("Failed to close file!!!");
				e.printStackTrace();
			}
		}
	}
}
