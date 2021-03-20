package com.cg.labwork.Lab2;
import java.util.*;
public class Exercise1 {
	public int getSecondSmallest(int [] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		return arr[1];
	}
	public static void main(String[] args) {
		Exercise1 eObj = new Exercise1();
		int []arr = new int[] {2,5,8,1,0,9,3};
		System.out.println("Second smallest number in the array is: " + eObj.getSecondSmallest(arr));
	}
}
