package com.cg.labwork.Lab2;

import java.util.Arrays;

public class Exercise3 {
	public static void main(String[] args) {
		int arr[] = new int[] {21,25,65,78,24,34,89,105};
		int result[] = getSorted(arr);
		System.out.println(Arrays.toString(result));
	}
	public static int[] getSorted(int[] arr) {
		int n = arr.length;
		int temp[] = new int[n];
		for(int i = 0; i < n; i++) {
			String str = Integer.toString(arr[i]);
			StringBuilder sb1 = new StringBuilder();
			sb1.append(str);
			sb1.reverse();
			temp[i] = Integer.parseInt(sb1.toString());
		}
		return temp;
	}

}
