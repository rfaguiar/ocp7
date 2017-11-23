package com.oracle.cap11.exemplo2;

public class Bob {

	private String nickname;
	private int shoeSize;

	public Bob(String nickname, int shoeSize) {
		this.nickname = nickname;
		this.shoeSize = shoeSize;
	}
	
	public String toString() {
		return "I am a Bob, but you can call me " + nickname + ". My shoe size is " + shoeSize;
	}

}
