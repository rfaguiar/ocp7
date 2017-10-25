package com.oracle.cap1.exemplo1;

public class Coffe {

	CoffeSize size;
	
	public static void main(String[] args) {
		Coffe drink1 = new Coffe();
		drink1.size = CoffeSize.BIG;
		
		Coffe drink2 = new Coffe();
		drink2.size = CoffeSize.OVERWHELMING;
		
		System.out.println(drink1.size.getOunces());
		for (CoffeSize cs : CoffeSize.values()) {
			System.out.println(cs + " " + cs.getOunces());
		}
	}
}
