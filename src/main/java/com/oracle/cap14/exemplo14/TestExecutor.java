package com.oracle.cap14.exemplo14;

import java.util.concurrent.Executor;

public class TestExecutor {
	public static void main(String[] args) {
		Runnable r = new MyRunnableTask();
		Executor ex = new NewThreadExecutor();
		ex.execute(r);
	}
}
