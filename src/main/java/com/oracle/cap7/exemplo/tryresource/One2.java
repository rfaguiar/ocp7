package com.oracle.cap7.exemplo.tryresource;

import java.io.IOException;

public class One2 implements AutoCloseable {

	@Override
	public void close() throws IOException {
		throw new IOException("Closing");
	}

}
