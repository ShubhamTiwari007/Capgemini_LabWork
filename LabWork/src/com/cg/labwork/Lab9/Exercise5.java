package com.cg.labwork.Lab9;

import java.util.Scanner;

@FunctionalInterface
interface DemoInterface4{
	int fact(int n);
}


class Factorial{	
	static int factorial(int n) {
		if(n == 0 || n == 1)
			return 1;
		return n * factorial(n-1);
	}	
}

public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = sc.nextInt();
		DemoInterface4 obj = Factorial::factorial;
		
		System.out.println("Factorial is = "+obj.fact(n));
		
		sc.close();
		
	}

}

