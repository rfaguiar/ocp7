package com.oracle.cap7.exemplo3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestTryResource {
	
	public void reader() throws IOException {
		Reader reader = null;
		
		try {
			reader = new InputStreamReader(new FileInputStream(""));
		} catch (IOException e) {
			log();
			throw e;
		} finally {
			if (reader != null) {
				try {
					reader.close();
			
				} catch (IOException e) {
					log();
					throw e;
				}
			}
		}
		
	}

	private void log() {
		// TODO Auto-generated method stub
		
	}
	
}
