package com.cg.labwork.Lab6;
import java.util.*;
public class Exercise4 {
	public static HashMap<String, String> getStudents(HashMap<String, Integer>hm){
		HashMap<String, String> result_hm = new HashMap<>();
		for(Map.Entry<String, Integer> temp_map : hm.entrySet())
		{
			String medal = "";
			int marks = temp_map.getValue();
			if(marks >= 90)
				medal = "Gold";
			else if (marks >= 80 && marks < 90)
				medal = "Silver";
			else if (marks >= 70 && marks < 80)
				medal = "Bronze";
			result_hm.put(temp_map.getKey(), medal);
		}
		return result_hm;
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("CS1001",89);
		hm.put("CS1002",76);
		hm.put("CS1003",98);
		hm.put("CS1004",77);
		hm.put("CS1005",92);
		hm.put("CS1006",82);
		HashMap<String, String> result = getStudents(hm);
		result.forEach((k,v) -> System.out.println("Student with registration number "+ k + " got " + v + " medal"));
	}
}