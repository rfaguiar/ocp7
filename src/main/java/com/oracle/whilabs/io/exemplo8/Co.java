package com.oracle.whilabs.io.exemplo8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Co {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		do {
			input = br.readLine();
			if (input.equalsIgnoreCase("End")) {
				break;
			} else {
				System.out.print(input);
			}
		} while(true);
	}
}
