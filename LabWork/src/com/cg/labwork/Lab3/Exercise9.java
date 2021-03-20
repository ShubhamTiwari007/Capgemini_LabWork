package com.cg.labwork.Lab3;
import java.util.*;
import java.time.*;
public class Exercise9 {
	public static void displayDuration(String str) {
		String temp[] = str.split("/");
		int userDate = Integer.parseInt(temp[0]);
		int userMonth = Integer.parseInt(temp[1]);
		int userYear = Integer.parseInt(temp[2]);
		Calendar current = Calendar.getInstance();
		LocalDate start_date = LocalDate.of(userYear, userMonth, userDate);
		LocalDate end_date = LocalDate.of(current.get(Calendar.YEAR), current.get(Calendar.MONTH)+1, current.get(Calendar.DATE));
		Period differce = Period.between(start_date, end_date); 
		System.out.printf("%d years, %d months and %d days ", differce.getYears(), differce.getMonths(), differce.getDays()); 
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date: ");
		String date = sc.nextLine();
		displayDuration(date);
	}
}
