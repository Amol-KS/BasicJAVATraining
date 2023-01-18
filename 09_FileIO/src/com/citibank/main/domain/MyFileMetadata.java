package com.citibank.main.domain;

import java.io.File;
import java.util.Date;

public class MyFileMetadata {
	private String path = "C:\\Amol_Java\\JavaTest.txt";
	
	public void printData() {
		File file = new File(path);
		if(file.exists()) {
			System.out.println("File Name: " + file.getName());
			System.out.println("File Path:" + file.getAbsolutePath());
			System.out.println("File Size:" + file.length());
			System.out.println("Can open:" + file.canExecute());
			System.out.println("Can write: " + file.canWrite());
			System.out.println("Can Read: " + file.canRead());
			Date lastModifiedDate = new Date(file.lastModified());
			System.out.println("Last modified: " + lastModifiedDate);
		}else {
			
			System.out.println("File dose not exists....");
			System.out.println("Enter valid Path...");
		}
	}

}
