package com.oracle.cap7.exemplo13;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestTryWithResource {

	public static void main(String[] args) {
		
		Reader reader = null;
		
		try {
			reader = new FileReader("");
		}catch (IOException e) {
			log();
		} finally {
			if (reader != null) {
				try{
					reader.close();
				} catch (IOException e) {
					
				}
			}
		}
		
	}

	private static void log() {
		
	}
	
}
