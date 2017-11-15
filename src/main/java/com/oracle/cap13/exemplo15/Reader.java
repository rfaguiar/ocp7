package com.oracle.cap13.exemplo15;

public class Reader extends Thread {

	Calculator c;
	
	public Reader(Calculator calc, String nome) {
		super(nome);
		c = calc;
	}
	
	@Override
	public void run() {
		synchronized (c) {
			try{ 
				System.out.println("Wainting for calculation...");
				c.wait();
			}catch (InterruptedException e) {
				System.out.println("Total is: " + c.total);
			}
		}
		System.out.println("Fim Reader " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		new Reader(calculator, "Reader 1").start();
		new Reader(calculator, "Reader 2").start();
		new Reader(calculator, "Reader 3").start();
		new Thread(calculator, "Calculator 1").start();
	}
}
