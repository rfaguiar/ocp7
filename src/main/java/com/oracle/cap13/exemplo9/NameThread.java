package com.oracle.cap13.exemplo9;

public class NameThread {
	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		Thread t = new Thread(nr/*, "Fred"*/);
		t.start();
	}
}
