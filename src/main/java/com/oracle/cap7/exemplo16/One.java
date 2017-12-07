package com.oracle.cap7.exemplo16;

import java.io.IOException;

public class One implements AutoCloseable {

	@Override
	public void close() throws IOException {
		System.out.println("Close - One");
		throw new IOException("closing");
	}

}
