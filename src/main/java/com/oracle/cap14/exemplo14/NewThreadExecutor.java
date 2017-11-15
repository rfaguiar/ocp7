package com.oracle.cap14.exemplo14;

import java.util.concurrent.Executor;

public class NewThreadExecutor implements Executor {

	@Override
	public void execute(Runnable command) {
		Thread t = new Thread(command);
		t.start();
	}

}
