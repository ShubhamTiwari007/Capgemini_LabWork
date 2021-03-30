package com.cg.labwork.Lab9;
@FunctionalInterface
interface Interface{	
	String formatString(String str);
}

public class Exercise2 {
	public static void main(String[] args) {
		Interface obj = (str) -> {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < str.length(); i++)
				sb.append(str.charAt(i)).append(" ");
			return sb.toString();
		};
		
		System.out.println(obj.formatString("DEMOSTRING"));
		
		
	}

}
