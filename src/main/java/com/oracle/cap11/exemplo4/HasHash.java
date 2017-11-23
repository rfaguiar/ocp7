package com.oracle.cap11.exemplo4;

public class HasHash {

	private int x;

	public HasHash(int x) {
		this.x = x;
	}
	
	public boolean equals(Object o) {
		HasHash h = (HasHash) o;
		if (h.x == this.x) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode() { return (x * 17); }
}
