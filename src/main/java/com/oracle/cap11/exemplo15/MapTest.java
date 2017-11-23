package com.oracle.cap11.exemplo15;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<Object, Object> m = new HashMap<Object, Object>();
		
		m.put("k1", new Dog("aiko"));
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT Key");
		Dog d1 = new Dog("clover");
		m.put(d1, "Dog Key");
		m.put(new Cat(), "Cat Key");
				
		System.out.println("get k1 " + m.get("k1"));
		String k2 = "k2";
		System.out.println("get k2 " + m.get(k2));
		Pets p = Pets.CAT;
		System.out.println("get CAT " + m.get(p));
		System.out.println("get clover " + m.get(d1));
		System.out.println("get new Cat " + m.get(new Cat()));
		System.out.println("size " + m.size());
		
		d1.name = "magnolia";
		System.out.println("get magnolia " + m.get(d1));
		
	}
	
	static class Cat{}
}