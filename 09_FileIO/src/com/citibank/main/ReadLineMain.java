package com.citibank.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import com.citibank.main.domain.MyFileReader;

public class ReadLineMain {

	public static void main(String[] args) {
		String path = "C:\\Amol_Java\\Amu.txt";
		int lineNum;
		String fileContaints;
		MyFileReader myFileReader;
		BufferedReader bufferedReader;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter line number to read:");
		lineNum = scanner.nextInt();
		myFileReader = null;
		bufferedReader = null;
		File file = new File(path);

		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			myFileReader = new MyFileReader(bufferedReader);
			fileContaints = myFileReader.readFileLineByLine(lineNum);
			if (fileContaints.equals("")) {
				System.out.println("FIle is empty or error");
			} else {
				System.out.println("File data:: " + fileContaints);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error while reading file!!");
		}finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Error in closing Buffered reader...");
			}
		}

	}

}
