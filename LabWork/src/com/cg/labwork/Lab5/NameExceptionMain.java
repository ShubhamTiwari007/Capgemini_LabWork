package com.cg.labwork.Lab5;

import java.util.Scanner;

public class NameExceptionMain {
	public static void validateName(String fname,String lname) throws NameException{
		if(fname == "" || lname == "")
			throw new NameException("Not a valid name");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name:");
		String fname = sc.nextLine();
		System.out.println("Enter the last name:");
		String lname = sc.nextLine();
		try {
			validateName(fname, lname);
			System.out.println("valid name");
		}
		catch(NameException e) {
			System.out.println(e.getMessage());
		}
	}

}
