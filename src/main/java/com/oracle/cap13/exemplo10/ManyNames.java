package com.oracle.cap13.exemplo10;

public class ManyNames {
	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr, "Ricky");
		Thread two = new Thread(nr, "Lucy");
		Thread three = new Thread(nr, "Fred");
		one.start();
		two.start();
		three.start();
	}
}
