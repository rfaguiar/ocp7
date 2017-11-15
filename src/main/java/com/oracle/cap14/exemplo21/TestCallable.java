package com.oracle.cap14.exemplo21;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {
	public static void main(String[] args) {
		
		Callable<Integer> c = new MyCallable();
		ExecutorService ex = Executors.newCachedThreadPool();
		Future<Integer> f = ex.submit(c);
		
		try {
			Integer v = f.get();
			System.out.println("Ran: " + v);
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("Faled");
			e.printStackTrace();
		}
		
	}
}
