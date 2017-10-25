package com.oracle.cap7.autoavaliaca.exercicio12;

public class Concert {
	static class PowerOutage extends Exception {}
	static class Thunderstorm extends Exception {}
	public static void main(String[] args) {
		try {
			new Concert().listen();
			System.out.println("a");
		} catch (PowerOutage | Thunderstorm e) {
//			e = new PowerOutage(); //não compila
			System.out.println("b");
		}finally {
			System.out.println("c");
		}
	}
	public void listen() throws PowerOutage, Thunderstorm {}
}
