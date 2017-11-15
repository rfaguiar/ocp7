package com.oracle.cap14.exemplo24;

public class TestIncrementThread {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		IncremenThread it1 = new IncremenThread(counter);
		IncremenThread it2 = new IncremenThread(counter);
		it1.start();
		it2.start();
		try {
			it1.join();
			it2.join();
		} catch (InterruptedException e) {}
		System.out.println(counter.getvalue());
		
	}
	
}
