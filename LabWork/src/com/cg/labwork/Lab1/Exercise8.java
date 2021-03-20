package com.cg.labwork.Lab1;
import java.util.*;
public class Exercise8 {
	public boolean checkNumber(int n) {
		if(n == 0)
			return false;
		while(n != 0) {
			n = n/2;
			if(n%2 != 0  && n != 1)
				return false;
		}
		return true;
	}
	public static void main(String [] args) {
		Exercise8 eObj = new Exercise8();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = in.nextInt();
		if(eObj.checkNumber(n))
			System.out.println(n + " is a power of 2");
		else
			System.out.println(n + " is not a power of 2");
	}

}
