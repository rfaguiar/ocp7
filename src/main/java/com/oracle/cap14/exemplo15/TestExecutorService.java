package com.oracle.cap14.exemplo15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {
	public static void main(String[] args) {
		
		Runnable r = new MyRunnableTask();
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.execute(r);
		
	}
}
