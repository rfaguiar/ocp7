package com.oracle.cap13.exemplo5;

public class DesafioThread implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if ((i % 10) == 0) {
				System.out.println("Run by " + Thread.currentThread().getName());
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}		
	}

}
