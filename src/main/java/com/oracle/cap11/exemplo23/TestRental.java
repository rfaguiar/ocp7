package com.oracle.cap11.exemplo23;

import java.util.ArrayList;
import java.util.List;

public class TestRental {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		List<Car> carList = new ArrayList<>();
		carList.add(c1);
		carList.add(c2);
		RentaLGeneric<Car> carRental = new RentaLGeneric<>(2, carList);
		
		Car carToRent = carRental.getRantal();
		carRental.returnRental(carToRent);
//		carList.add(new Cat());
	}
}
