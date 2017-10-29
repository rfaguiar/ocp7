package com.oracle.whilabs.io.exemplo6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Co {
	public static void main(String[] args) {
		int i;
		InputStream in  = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		try {
			i = br.read();
			System.out.println("ASCII value of " +(char)i + " is "+i);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
