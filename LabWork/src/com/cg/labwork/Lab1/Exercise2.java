package com.cg.labwork.Lab1;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the light color: ");
		String color = input.nextLine();
		String message = null;
		if(color.matches("red"))
			message = "stop";
		else if(color.matches("yellow"))
			message = "ready";
		else if(color.matches("green"))
			message = "go";
		else
			message = "Wrong input";
		System.out.println("Message is: " + message);
	}

}
