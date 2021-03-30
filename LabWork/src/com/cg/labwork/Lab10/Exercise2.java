package com.cg.labwork.Lab10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the file name: ");
		String file = sc.nextLine();
		file = "C:\\Users\\tshub\\git\\Capgemini_LabWork\\LabWork\\src\\com\\cg\\labwork\\Lab10\\"+file+".txt";
		
		if(isFilePresent(file))
			System.out.println();
		else {
			System.out.println("No such file exist!!");
			return;
		}
					
		if(isFileReadable(file)) 
			System.out.println("file is readable");
		else 
		    System.out.println("file is not readable");
		
	
		if(isFileWriteable(file)) 
			System.out.println("file is writable");
		else 
		    System.out.println("file is not writable");
		      
		System.out.println("Extension of file is: " + fileExtension(file));
		
		System.out.println("Size of file: " + getLength(file));
		sc.close();
	}
	
	public static boolean isFilePresent(String file) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			return true;
		}
		catch(FileNotFoundException e) {
			return false;
		}
	}
	
	public static boolean isFileReadable(String file) {
		Path path = Paths.get(file);
		return Files.isReadable(path);
		
	}
	
	public static boolean isFileWriteable(String file) {
		Path path = Paths.get(file);
		return Files.isWritable(path);
		
	}
	
	public static String fileExtension(String file) {
		File f = new File(file);
		String name = f.toString();
		String extension = "";
		int i = name.lastIndexOf('.');
		if(i > 0)
			extension = name.substring(i + 1);
		return extension;
	}
	
	public static long getLength(String file) {
		File f = new File(file);
		return f.length();
	}
}