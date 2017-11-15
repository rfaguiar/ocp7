package com.oracle.cap14.exemplo27;

public class MyRunnableTask implements Runnable {

	@Override
	public void run() {
		System.out.println("Executando em " + Thread.currentThread().getName());
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		System.out.println("Fim da Execução");
	}

}
