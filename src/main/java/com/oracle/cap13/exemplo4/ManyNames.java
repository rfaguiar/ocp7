package com.oracle.cap13.exemplo4;

public class ManyNames {
	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr, "fred");
		Thread two = new Thread(nr, "Lucy");
		Thread three = new Thread(nr, "Ricky");
		
		one.start();
		two.start();
		three.start();
	}
}
