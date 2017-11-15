package com.oracle.cap14.exemplo18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.oracle.cap14.exemplo17.MyRunnableTask;

public class TestSingleThreadExecutor {
	public static void main(String[] args) {
		
		Runnable r = new MyRunnableTask();
		ExecutorService ex = Executors.newSingleThreadExecutor();
		ex.execute(r);
		
	}
}
