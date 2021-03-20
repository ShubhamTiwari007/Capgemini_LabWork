package com.cg.labwork.Lab1;
import java.util.*;
public class Exercise6 {
	public int calculateDiference(int n) {
		int Sum = 0, sumOfSquare = 0, squareofSum = 0;
		for(int i = 1; i <=n; i++) {
			sumOfSquare += Math.pow(i, 2);
			squareofSum += i;
			}
		squareofSum = (int) Math.pow(squareofSum, 2);
		Sum = sumOfSquare - squareofSum;
		return Sum;
	}
	public static void main(String[] args) {
		Exercise6 eObj = new Exercise6();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = in.nextInt();
		System.out.println("Differrence is: " + eObj.calculateDiference(n));
	}
}