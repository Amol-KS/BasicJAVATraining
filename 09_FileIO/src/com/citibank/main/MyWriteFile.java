package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import com.citibank.main.domain.WriteMyFile;

public class MyWriteFile {

	public static void main(String[] args) {
		File file;
		String outputPath;
		String outMess;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter File Path with name and extension:");
		outputPath = scanner.next();
		System.out.println("Enter text to write :");
		outMess = scanner.next();
		
		file = new File(outputPath);
		OutputStream outputStream = null;
		WriteMyFile writeMyFile = null;
		
		try {
//			New file creation
//			outputStream  = new FileOutputStream(file);
//			Append existing file
			outputStream  = new FileOutputStream(file,true);
			writeMyFile = new WriteMyFile(outputStream, outMess);
			
			if (writeMyFile.writeFile()){
				System.out.println("Please check your file.....");
			}else {
				System.out.println("Failed to write file....");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
