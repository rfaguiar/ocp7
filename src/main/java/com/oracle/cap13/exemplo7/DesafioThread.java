package com.oracle.cap13.exemplo7;

public class DesafioThread extends Thread {
	
	private StringBuffer sb = new StringBuffer();
	private String letra;

	public DesafioThread(String letra) {
		this.letra = letra;		
	}
	
	@Override
	public void run() {
		synchronized (sb) {
			for (int i = 0; i < 100; i++) {
				System.out.print(sb);
				sb.append(letra);
			}
		}
	}
}
