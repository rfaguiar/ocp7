package com.oracle.whilabs.io.exemplo9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pattern1 {
	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("abc.txt", true));
			out.write("world");
			
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
