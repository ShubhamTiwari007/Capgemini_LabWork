package com.cg.labwork.Lab3;
import java.util.*;
public class Exercise4 {
	public static int modifyNumber(int number) {
		if((number % 10) == number)
			return number;
		String num = Integer.toString(number);
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < num.length()-1;i++) {
			int number1 = Character.getNumericValue(num.charAt(i));
			int number2 = Character.getNumericValue(num.charAt(i+1));
			int difference = (int)Math.abs(number1 - number2);
			sb.append(Integer.toString(difference));
		}
		sb.append(num.charAt(num.length()-1));
		String str = sb.toString();
		int result  = Integer.parseInt(str);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		System.out.println("Result is: " + modifyNumber(number));
	}
}
