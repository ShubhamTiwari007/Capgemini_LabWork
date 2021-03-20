package com.cg.labwork.Lab3;
import java.util.*;
public class Exercise1 {
	public static int sumSeries(String str) {
		int sum = 0;
		StringTokenizer stringToken = new StringTokenizer(str," ");
		while(stringToken.hasMoreTokens()) {
			String temp = stringToken.nextToken();
			int number = Integer.parseInt(temp);
			System.out.print(number + " ");
			sum += number;
		}
		return sum;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integers: ");
		String str = sc.nextLine();
		System.out.println("\nSum is: " + sumSeries(str));
	}
}