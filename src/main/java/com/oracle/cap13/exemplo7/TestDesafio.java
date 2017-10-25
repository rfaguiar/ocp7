package com.oracle.cap13.exemplo7;

public class TestDesafio {
	public static void main(String[] args) {
		DesafioThread t1 = new DesafioThread("A");
		DesafioThread t2 = new DesafioThread("B");
		DesafioThread t3 = new DesafioThread("C");
		t1.start();
		t2.start();
		t3.start();
	}
}
