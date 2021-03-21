package com.cg.labwork.Lab6;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class Exercise6 {
	public static int getAge(String str) {
		String arr[] = str.split("/");
		int day = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int year = Integer.parseInt(arr[2]);
		
		LocalDate current = LocalDate.now();
		LocalDate birthdate = LocalDate.of(year, month, day);
		
		Period p = Period.between(birthdate,current);
		
		return p.getYears();
	}
	public static ArrayList<Integer> votersList(HashMap<Integer,String>hm){
		ArrayList<Integer> list = new ArrayList<>();
		for(Map.Entry<Integer, String> temp: hm.entrySet())
		{
			String dob = temp.getValue();
			int age = getAge(dob);
			if(age > 18)
				list.add(temp.getKey());
		}
		return list;
	}
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1001,"25/02/1980");
		hm.put(1002,"08/09/2019");
		hm.put(1003,"18/10/1925");
		hm.put(1004,"02/04/1999");
		hm.put(1005,"25/03/1998");
		hm.put(1006,"15/08/1947");
		
		ArrayList<Integer> list = votersList(hm);
		
		System.out.println("Voters list is given below");
		list.forEach(a -> System.out.println(a));
	}
}
