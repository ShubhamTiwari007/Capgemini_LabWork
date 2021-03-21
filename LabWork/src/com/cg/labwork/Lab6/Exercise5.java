package com.cg.labwork.Lab6;
import java.util.*;
public class Exercise5 {
	public static int getSecondSmallest(int [] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int num : arr)
			list.add(num);
		Collections.sort(list);
		return list.get(1);
	}
	public static void main(String[] args) {
		int arr[] = new int[]{3,4,5,1,2,9,8};
		System.out.println(getSecondSmallest(arr));
	}
}
