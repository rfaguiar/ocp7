package com.oracle.cap11.exemplo21;

public class AnimalDoctor {
	public static void main(String[] args) {
		Dog[] dogs = {new Dog(), new Dog()};
		Cat[] cats = {new Cat(), new Cat(), new Cat()};
		Bird[] birds = {new Bird()};
		
		AnimalDoctor doc = new AnimalDoctor();
		doc.checkAnimals(dogs);
		doc.checkAnimals(cats);
		doc.checkAnimals(birds);
	}
	
	public void checkAnimals(Animal[] animals) {
		for (Animal a : animals) {
			a.checkup();
		}
	}
}
