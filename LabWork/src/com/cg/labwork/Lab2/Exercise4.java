package com.cg.labwork.Lab2;
import java.util.*;
public class Exercise4 {
	public static int[] modifyArray(int arr[]) {
		LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			s1.add(arr[i]);
		}
		TreeSet<Integer>s2 = new TreeSet<>(s1);
		TreeSet<Integer>obj =(TreeSet<Integer>) s2.descendingSet();
		int j=0;
		int [] temp = new int[s2.size()];
		for(Integer i : obj) {
			temp[j++] = i;
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };
		int result[] = modifyArray(arr);
		System.out.println(Arrays.toString(result));
	}

}
