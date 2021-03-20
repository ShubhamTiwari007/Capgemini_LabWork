package com.cg.labwork.Lab6;
import java.util.*;
public class Exercise3 {
	public static HashMap<Integer, Integer> getSquares(int [] arr){
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int num: arr) {
			hm.put(num, (num*num));
		}
		return hm;
	}
	public static void main(String[] args) {
		Random random = new Random();
		int arr[] = new int[10];
		for(int i = 0; i < 10; i++)
			arr[i] = random.nextInt(20);	//generating random number within range of 20
		HashMap<Integer, Integer> hm = getSquares(arr);
		hm.forEach((k,v) -> System.out.println("Square of " + k + " is: " + v));
	}
}
