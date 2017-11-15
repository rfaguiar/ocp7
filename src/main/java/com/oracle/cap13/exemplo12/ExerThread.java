package com.oracle.cap13.exemplo12;

public class ExerThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.println(i + " - Running");
			}
			try{ sleep(1000); } catch (InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		ExerThread t = new ExerThread();
		t.start();
	}
}
