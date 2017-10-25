package com.oracle.cap13.exemplo5;

public class TestDesafioThread {
	public static void main(String[] args) {
		DesafioThread d = new DesafioThread();
		Thread t = new Thread(d, "Ricky");
		t.start();
	}
}
