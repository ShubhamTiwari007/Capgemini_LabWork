package com.cg.labwork.Lab1;
import java.util.*;
public class Exercise7 {
	public boolean checkNumber(int number) {
		int current;
		int previous = number % 10;
		number = number / 10;
		while(number != 0) {
			current = number % 10;
			if(previous < current)
				return false;
			previous = current;
			number = number / 10;
		}
		return true;
	}
	public static void main(String [] args) {
		Exercise7 eObj = new Exercise7();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = in.nextInt();
		if(eObj.checkNumber(n))
			System.out.println(n + " is an increasing number");
		else
			System.out.println(n + " is not an increasing number");
	}
}
