package com.oracle.cap11.exemplo21;

import java.util.ArrayList;
import java.util.List;

public class AnimalDoctorGeneric {

	public void checkAnimals(List<Animal> animals) {
		for (Animal a : animals) {
			a.checkup();
		}
	}
	
	public static void main(String[] args) {
		
		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		
		List<Cat> cats = new ArrayList<>();
		cats.add(new Cat());
		cats.add(new Cat());
		
		List<Bird> birds = new ArrayList<>();
		birds.add(new Bird());
		
		List<Animal> animals = new ArrayList<>();
		animals.add(new Cat());
		animals.add(new Dog());
		
		AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
//		doc.checkAnimals(dogs);
//		doc.checkAnimals(cats);
//		doc.checkAnimals(birds);
		doc.checkAnimals(animals);
		
	}
}
