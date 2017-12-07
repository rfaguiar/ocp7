package com.oracle.cap7.exemplo8;

import java.io.IOException;

public class Bad implements AutoCloseable {
	
	private String name;

	public Bad(String n) {
		name = n;
	}

	@Override
	public void close() throws Exception {
		throw new IOException("Closing - " + name);
	}

}
