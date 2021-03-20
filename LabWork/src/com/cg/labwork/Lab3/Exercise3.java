package com.cg.labwork.Lab3;
import java.util.Scanner;
public class Exercise3 {
	public static boolean isVowel(char ch) {
		if(ch == 'A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
			return true;
		else
			return false;
	}
	public static String alterString(String str) {
		char vowels[] = new char[] {'A','a','E','e','I','i','O','o','U','u'};
		int size = str.length();
		String result = "";
		for(int i = 0; i < size; i++)
		{
			char temp = str.charAt(i);
			if(isVowel(temp))
				result += temp;
			else
				result += (char)(temp+1);	
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string: ");
		String str = sc.nextLine();
		System.out.println(alterString(str));
	}
}
