package com.cg.labwork.Lab2;

import java.util.Arrays;

public class Exercise2 {
	public static String[] sortStrings(String []arr) {
		Arrays.sort(arr);
		int mid;
		int n = arr.length;
		String temp[] = new String[n];
		if(n%2==0)
			mid = n/2;
		else
			mid = (n/2)+1;
		for(int i = 0; i < mid; i++)
			temp[i] = arr[i].toUpperCase();
		for(int i = mid; i < n; i++)
			temp[i] = arr[i].toLowerCase();
		return temp;
	}
	public static void main(String[] args) {
		String arr[] = new String[] {"banana","apple","strawberry","pumpkin","cucumber","orange"};
		String result[] = sortStrings(arr);
		System.out.println(Arrays.toString(result));
	}

}
