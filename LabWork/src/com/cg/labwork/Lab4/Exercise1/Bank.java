package com.cg.labwork.Lab4.Exercise1;

public class Bank {
	public static void main(String []args) {
		Person person1 = new Person("Smith",23);
		Person person2 = new Person("Kathy",26);
		Account account1 = new Account(2000,person1);
		Account account2 = new Account(3000,person2);
		account1.deposit(2000);
		account2.withdraw(2000);
		System.out.println(account1.toString());
		System.out.println(account2.toString());
	}
}
