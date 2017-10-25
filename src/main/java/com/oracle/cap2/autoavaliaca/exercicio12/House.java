package com.oracle.cap2.autoavaliaca.exercicio12;

public class House extends Building {
	public House() {
		System.out.println("h ");
	}
	House(String name) {
		this();
		System.out.println("hn " + name);
	}
	public static void main(String[] args) {
		new House("x ");
	}
}
