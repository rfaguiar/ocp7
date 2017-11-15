package com.oracle.cap14.exemplo16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {
	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		int cpus = rt.availableProcessors();
		System.out.println("CPUs " + cpus);
		
		Runnable r = new MyRunnableTask();
		ExecutorService ex = Executors.newFixedThreadPool(cpus);
		ex.execute(r);
		
	}
}
