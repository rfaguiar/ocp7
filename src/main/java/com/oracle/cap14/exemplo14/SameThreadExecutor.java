package com.oracle.cap14.exemplo14;

import java.util.concurrent.Executor;

public class SameThreadExecutor implements Executor {

	@Override
	public void execute(Runnable command) {
		command.run();
	}

}
