package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

import com.citibank.main.domain.MyFileWriter;
import com.citibank.main.domain.WriteMyFile;

public class MyFileWriterMain {

	public static void main(String[] args) {
		File file;
		String outputPath = "C:\\Amol_Java\\Amu1.txt";
		String inMess = "Wrtint a file......";
		
		file = new File(outputPath);
		Writer fileWriter = null;
		MyFileWriter myFileWriter = null;
		
		try {
			fileWriter  = new FileWriter(file);
			myFileWriter = new MyFileWriter(fileWriter, inMess);
			
			if (myFileWriter.writeFile()){
				System.out.println("Please check your file.....");
			}else {
				System.out.println("Failed to write file....");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

