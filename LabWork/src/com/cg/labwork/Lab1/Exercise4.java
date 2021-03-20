package com.cg.labwork.Lab1;
import java.util.*;
public class Exercise4 {
	public static boolean isPrime(int n) {
		if(n==0 || n==1)
			return false;
		else if(n == 2)
			return true;
		else {	
			for(int i = 2; i < n; i++) {
				if(n % i == 0) 
					return false;					
				}
			return true;
		}
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = in.nextInt();
		System.out.println("Prime numbers upto " + num + " are: ");
		for(int i = 1; i <= num; i++) {
			if(isPrime(i))
				System.out.print(i + " ");
		}
	}
}
