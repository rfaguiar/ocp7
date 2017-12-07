package com.oracle.cap7.exemplo14;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestTryWithResource {
	
	public static void main(String[] args) throws IOException {
		
		try (Reader reader = new FileReader("")) {
			
		} catch (IOException e) {
			log();
			throw e;
		}
		
	}

	private static void log() {
		// TODO Auto-generated method stub
		
	}
	
}
