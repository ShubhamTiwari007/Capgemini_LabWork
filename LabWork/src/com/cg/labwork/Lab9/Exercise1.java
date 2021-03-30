package com.cg.labwork.Lab9;
@FunctionalInterface
interface PowerUsingLambda{	
	int power(int x, int y);	
}

public class Exercise1 {
	public static void main(String[] args) {
		PowerUsingLambda obj = (x, y) -> (int) (Math.pow(x, y));
		System.out.println(obj.power(2,32));
		}
}