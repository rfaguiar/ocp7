package com.oracle.cap11.exemplo40;

import java.util.ArrayList;
import java.util.List;

public class TestRental {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		List<Car> carList = new ArrayList<>();
		carList.add(c1);
		carList.add(c2);
		RentalGeneric<Car> carRental = new RentalGeneric<>(carList, 2);
		
		Car carToRent = carRental.getRental();
//		carList.add(new Cat());
		
	}
}

class Car {}
