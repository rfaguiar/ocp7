package com.oracle.cap11.exemplo21;

import java.util.ArrayList;
import java.util.List;

public class AnimalsDoctorAdder {
	public void addAnimal (List<Animal> animals) {
		animals.add(new Dog());
		animals.add(new Bird());
	}
	
	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<>();
		animals.add(new Dog());
		animals.add(new Cat());
		AnimalsDoctorAdder doc = new AnimalsDoctorAdder();
		doc.addAnimal(animals);
	}
}
