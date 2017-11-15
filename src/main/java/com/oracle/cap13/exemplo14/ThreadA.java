package com.oracle.cap13.exemplo14;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			System.out.println("Wainting for b to complete...");
			try { b.wait(); } catch (InterruptedException e) {}
			System.out.println("Total is: " + b.total);
		}
	}
}
