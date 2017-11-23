package com.oracle.cap11.exemplo15;

public class Dog {
	public String name;

	public Dog(String name){
		this.name = name;
		
	}
	
	public boolean euals(Object o) {
		if ((o instanceof Dog) && ((Dog)o).name == name) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return name.length();
	}
}
