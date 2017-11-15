package com.oracle.cap14.exemplo27;

import java.util.concurrent.Executor;

public class SameThreadExecutor implements Executor {

	@Override
	public void execute(Runnable command) {
		command.run();
	}

}
