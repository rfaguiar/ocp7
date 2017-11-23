package com.oracle.cap11.exemplo24;

public class UseTwo<T, X> {
	T one;
	X two;
	
	public UseTwo(T one, X two) {
		this.one = one;
		this.two = two;
	}
	
	public T getT() {
		return one;
	}
	
	public X getX() {
		return two;
	}
	
	public static void main(String[] args) {
		UseTwo<String, Integer> twos = new UseTwo<>("foo", 42);
		
		String theT = twos.getT();
		int thrX = twos.getX();
	}
}
