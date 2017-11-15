package com.oracle.cap14.exemplo28;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestMyCallable {
	public static void main(String[] args) {
		
		Callable<Integer> c = new MyCallable();
		ExecutorService ex = Executors.newCachedThreadPool();
		Future<Integer> f = ex.submit(c);
		
		try {
			Integer v = f.get();
			System.out.println("Ran: " + v);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
			System.out.println("Failed");
		}
		
		ex.shutdown();
		System.out.println("Shutdown");
	}
}
