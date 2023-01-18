package com.citibank.main.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class ReadMyFile1 {
	private String path = "C:\\Amol_Java\\JavaTest.txt";
	private InputStream inputStream;
	private byte[] data;
	private int arrayLength;
	
	public void readFile() {
		try {
			File file = new File(path);
			arrayLength = (int) file.length();
			data = new byte[arrayLength];
			
			inputStream = new FileInputStream(path);
			
			inputStream.read(data);
			for (byte b : data) {
				System.out.print((char)b);
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
