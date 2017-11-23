package com.oracle.cap11.exemplo5;

import java.io.Serializable;

public class SaveMe implements Serializable {

	private static final long serialVersionUID = 1L;
	
	transient int x;
	int y;
	
	SaveMe(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int hashCode() {
		return (x ^ y);
	}
	
	public boolean equals(Object o) {
		SaveMe test = (SaveMe) o;
		if ( test.y == y && test.x == x) {
			return true;
		} else {
			return false;
		}
	}

}
