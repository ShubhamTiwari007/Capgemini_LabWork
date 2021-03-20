package com.cg.labwork.Lab3;
import java.util.*;
public class Exercise8 {
	public static boolean isPositiveString(String str) {
		int size = str.length();
		char temp[] = new char[size];
		for(int i = 0; i < size; i++) {
			temp[i] = str.charAt(i);
		}
		Arrays.sort(temp);
		for(int i = 0; i < size; i++) {
			if(temp[i] != str.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string: ");
		String str = sc.nextLine();
		if(isPositiveString(str))
			System.out.println("It is positive string");
		else
			System.out.println("It is not positive string");
	}
}
