package com.cg.labwork.Lab5;

import java.util.Scanner;

public class AgeExceptionMain {
	public static void validateAge(int age) throws AgeException{
		if(age < 15)
			throw new AgeException("not valid age");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		try {
			validateAge(age);
			System.out.println("valid age");
		}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
