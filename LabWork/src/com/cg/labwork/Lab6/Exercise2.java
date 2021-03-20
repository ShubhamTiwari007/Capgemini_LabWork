package com.cg.labwork.Lab6;
import java.util.*;
public class Exercise2 {
	public static Map<Character,Integer> countChars (char[] arr){
		Map<Character,Integer> hm = new HashMap<Character, Integer>();
		for(char ch : arr) {
			if(hm.containsKey(ch))
				hm.put(ch,hm.get(ch)+1);
			else
				hm.put(ch,1);
		}
		return hm;
	}
	public static void main(String[] args) {
		char [] arr = new char[] {'a','c','e', 'b', 'c', 'a', 'd'};
		Map<Character,Integer> hm = countChars(arr);
		hm.forEach((k,v) -> System.out.println("Number of occurences of " + k + " : " + v));
	}
}