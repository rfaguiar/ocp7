package com.oracle.cap14.exemplo27;

import java.util.concurrent.Executor;

public class TestNewThreadExecutor {
	public static void main(String[] args) {
		Runnable r = new MyRunnableTask();
		Executor ex = new NewThreadExecutor();
		ex.execute(r);
	}
}
