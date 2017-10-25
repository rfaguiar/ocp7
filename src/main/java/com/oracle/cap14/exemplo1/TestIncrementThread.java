package com.oracle.cap14.exemplo1;

public class TestIncrementThread {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		IncrementThread it1 = new IncrementThread(counter);
		IncrementThread it2 = new IncrementThread(counter);
		
		it1.start();
		it2.start();
		
		it1.join();
		it2.join();
		
		System.out.println(counter.getValue());
	}
}
