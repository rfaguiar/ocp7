package com.oracle.cap7.exemplo.tryresource;

import java.io.IOException;

public class Bad implements AutoCloseable {
	String name;
	
	public Bad(String name){
		this.name = name;		
	}

	@Override
	public void close() throws Exception {
		throw new IOException("Closing - " + name);
	}

}
