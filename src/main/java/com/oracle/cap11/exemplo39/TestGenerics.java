package com.oracle.cap11.exemplo39;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
	public static void main(String[] args) {
		List<Dog> animals = new ArrayList<>();
		animals.add(new Dog());
		animals.add(new Dog());
		TestGenerics doc = new TestGenerics();
		doc.addAnimal(animals);
	}
	
	public void addAnimal(List<? super Dog> animals) {
		animals.add(new Dog());
//		animals.add(new Animal());não compila
//		animals.add(new Object());não compila
	}

	public void addAnyAnimal(List<?> animals) {
//		animals.add(new Dog());
//		animals.add(new Animal());não compila
//		animals.add(new Object());não compila
	}

	public void addObjAnimal(List<Object> animals) {
		animals.add(new Dog());
//		animals.add(new Animal());não compila
//		animals.add(new Object());não compila
	}
}

class Animal { }
class Dog extends Animal {}