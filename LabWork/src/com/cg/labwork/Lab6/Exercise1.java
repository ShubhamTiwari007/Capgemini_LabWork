package com.cg.labwork.Lab6;
import java.util.*;
public class Exercise1 {
	public static ArrayList<Integer> getValues(HashMap<Integer, Integer>hm){
		ArrayList<Integer> resultantList = new ArrayList<>(hm.values());
		Collections.sort(resultantList);
		return resultantList;		
	}
	public static void main(String[] args) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(1,32);
		hm.put(2, 10);
		hm.put(3, 1);
		hm.put(4,21);
		hm.put(5, 11);
		hm.put(6, 45);
		hm.put(7,87);
		hm.put(8, 90);
		hm.put(9, 100);
		getValues(hm).forEach(number -> System.out.println(number));
	}
}