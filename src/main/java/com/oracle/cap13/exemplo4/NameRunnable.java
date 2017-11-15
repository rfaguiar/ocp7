package com.oracle.cap13.exemplo4;

public class NameRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 4; i++) {
			System.out.println("Run by " + Thread.currentThread().getId());
			try{ Thread.sleep(1000);}catch(InterruptedException e){}
		}
	}

}
