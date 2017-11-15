package com.oracle.cap14.exemplo27;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduledThreadPool {
	public static void main(String[] args) {
		Runnable r = new MyRunnableTask();
		ScheduledExecutorService ftses = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println("Inicio do execute");
		ftses.schedule(r, 5, TimeUnit.SECONDS);
	}
}
