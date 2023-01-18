package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import com.citibank.main.domain.MyFileReader;

public class MyFileReaderMain {

	public static void main(String[] args) {
		String path = "C:\\Amol_Java\\Amu.txt";
		String fileContaints;
		MyFileReader myFileReader;
		Reader reader;
		
		myFileReader = null;
		reader = null;
		File file = new File(path);
		
		try {
			reader = new FileReader(file);
			myFileReader = new MyFileReader(file, reader);
			fileContaints = myFileReader.readFile();
			if(fileContaints.equals("")) {
				System.out.println("FIle is empty or error");
			}else {
				System.out.println("File data:: " + fileContaints);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error while reading file!!");
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("Error while closing Reader....");
			}
		}
	}

}
