package com.cg.labwork.Lab1;
public class Exercise1 {
	public static int sumOfCubeOfDigit(int num) {
		int sum = 0;
		while(num != 0) {
			int r = num % 10;
			sum += Math.pow(r, 3);
			num = num / 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num = 176;
		System.out.println(sumOfCubeOfDigit(num));
	}
}
