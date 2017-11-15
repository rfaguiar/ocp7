package com.oracle.cap14.exemplo12;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestBlockingQueue {
	public static void main(String[] args) {
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(1);
		try {
			bq.put(42);
			bq.put(43);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
