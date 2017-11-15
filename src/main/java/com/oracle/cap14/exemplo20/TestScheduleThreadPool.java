package com.oracle.cap14.exemplo20;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduleThreadPool {
	public static void main(String[] args) {
		
		Runnable r = new MyRunnableTask();
		ScheduledExecutorService ftses = Executors.newScheduledThreadPool(4);
		ftses.scheduleAtFixedRate(r, 2, 5, TimeUnit.SECONDS);
		
	}
}
