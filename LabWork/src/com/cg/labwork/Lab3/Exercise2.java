package com.cg.labwork.Lab3;
import java.util.*;
public class Exercise2 {
	public static String getImage(String str) {
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.reverse();
		return str + "|" +sb.toString();
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string: ");
		String str = sc.nextLine();
		System.out.println(getImage(str));
	}
}
