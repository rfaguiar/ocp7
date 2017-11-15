package com.oracle.cap13.exemplo5;

public class Account {
	private int balance = 50;
	
	public int getBalance() {
		return this.balance;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
}
