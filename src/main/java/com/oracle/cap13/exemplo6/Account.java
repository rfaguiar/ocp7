package com.oracle.cap13.exemplo6;

public class Account {
	private int balance = 50;
	public int getBalane() {
		return balance;
	}
	public void withdraw(int amount) {
		balance -= amount;
	}
}
