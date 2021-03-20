package com.cg.labwork.Lab1;
import java.util.*;
public class Exercise5 {
	public int calculateSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		return sum;
	}
	public static void main(String [] args) {
		Exercise5 eObj = new Exercise5();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = in.nextInt();
		System.out.println("Sum is: " + eObj.calculateSum(n));
	}
}
