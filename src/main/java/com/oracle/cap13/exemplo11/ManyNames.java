package com.oracle.cap13.exemplo11;

public class ManyNames {
	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr, "Fred");
		Thread two = new Thread(nr, "Lucy");
		Thread three = new Thread(nr, "Ricky");
		one.start();
		two.start();
		three.start();
	}
}
