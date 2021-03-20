package com.cg.labwork.Lab1;
import java.util.*;
public class Exercise3 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the term: ");
		int num = in.nextInt();
		System.out.println(num + " th term of the fibonacci series using recursion is: "+recursiveFib(num-1));
		System.out.println(num + " th term of the fibonacci series without recursion is: "+nonrecursiveFib(num));

	}
	public static int recursiveFib(int n) {
		if(n<=1)
			return n;
		return recursiveFib(n-1) + recursiveFib(n-2);
	}
	public static int nonrecursiveFib(int n) {
		int next, t1=0,t2=1,i;
		if(n == 0 || n == 1)
			return n;
		else {
			next = t1 + t2;
			for (i = 3; i <= n; ++i){
			t1 = t2;
			t2 = next;
			next = t1 + t2;
			}
		return t2;
		}
	}
}