package com.cg.labwork.Lab4.Exercise1;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	private static long autoAccNum = 1002001L;
	public Account() {}
	public Account(double balance, Person accHolder) {
		this.accNum = autoAccNum;
		this.balance = balance;
		this.accHolder = accHolder;
		autoAccNum++;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = autoAccNum;
		autoAccNum++;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void withdraw(double amount) {
		this.setBalance(this.getBalance() - amount);
	}
	public void deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
	}	
	@Override
	public String toString() {
		return "Account [accNum: " + this.getAccNum() + ", balance: " + this.getBalance() + 
				", accHolder Name: " + this.getAccHolder().getName() + ", accHolder Age: " + this.getAccHolder().getAge() + "]";
	}
}
