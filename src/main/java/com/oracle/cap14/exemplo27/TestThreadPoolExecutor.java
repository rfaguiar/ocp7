package com.oracle.cap14.exemplo27;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestThreadPoolExecutor {
	public static void main(String[] args) {
		Runnable r = new MyRunnableTask();
		ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		tpe.setCorePoolSize(8);
		tpe.setMaximumPoolSize(8);
		tpe.execute(r);
	}
}
