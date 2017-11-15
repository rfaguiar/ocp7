package com.oracle.cap13.exemplo13;

public class RunJoinTest {
	public static void main(String[] args) {
		JoinTest r = new  JoinTest();
		Thread a = new Thread(r, "A");
		Thread b = new Thread(r, "B");
		a.start();
		b.start();
		try{ b.join(); } catch (InterruptedException e) {}
	}
}
