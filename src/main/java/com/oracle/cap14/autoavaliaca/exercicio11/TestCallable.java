package com.oracle.cap14.autoavaliaca.exercicio11;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TestCallable {
	private Integer executeTask(ExecutorService service, Callable<Integer> task) {
		try{
//			return service.submit(task);
//			return service.execute(task);
			Future<Integer> future = service.submit(task);
			return future.get();
		} catch (Exception e) {
			return null;
		}
	}
}
