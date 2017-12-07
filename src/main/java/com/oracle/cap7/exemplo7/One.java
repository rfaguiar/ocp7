package com.oracle.cap7.exemplo7;

import java.io.IOException;

public class One implements AutoCloseable {

	@Override
	public void close() throws IOException{
		throw new IOException("One");
	}

}
