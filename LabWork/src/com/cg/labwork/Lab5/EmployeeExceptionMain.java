package com.cg.labwork.Lab5;

import java.util.Scanner;

public class EmployeeExceptionMain {
	public static void validateSalary(int sal) throws EmployeeException{
		if(sal < 3000)
			throw new EmployeeException("not valid salary");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary: ");
		int sal = sc.nextInt();
		try {
			validateSalary(sal);
			System.out.println("Valid salary");
		}
		catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}
