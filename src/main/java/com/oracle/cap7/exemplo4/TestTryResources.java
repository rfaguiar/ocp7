package com.oracle.cap7.exemplo4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestTryResources {

	public void reader() throws IOException {
		try (Reader reader = new BufferedReader(new FileReader(""))) {
			
		} catch (IOException e) {
			log();
			throw e;
		}
	}

	private void log() {
		// TODO Auto-generated method stub
		
	}
	
}
