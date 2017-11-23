package com.oracle.cap11.exemplo3;

public class EqualsTest {

		public static void main(String[] args) {
			
			Moof one = new Moof(8);
			Moof two = new Moof(8);
			
			if (one.equals(two)) {
				System.out.println("one and two are equals");
			}
		}
}
