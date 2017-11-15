package com.oracle.cap14.exemplo28;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.oracle.cap14.exemplo27.MyRunnableTask;

public class TestRunnable {
	public static void main(String[] args) {
		
		Runnable r = new MyRunnableTask();
		ExecutorService ex = Executors.newCachedThreadPool();
		Future<?> f = ex.submit(r);
		
		try {
			Object v = f.get();
			System.out.println("Ran: " + v);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
			System.out.println("Failed");
		}
		
		ex.shutdown();
	}
}
