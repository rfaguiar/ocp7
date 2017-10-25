package com.oracle.cap13.exemplo2;

public class NameThread {
	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		Thread t = new Thread(nr);
		t.setName("Fred");
		t.start();
	}
}
