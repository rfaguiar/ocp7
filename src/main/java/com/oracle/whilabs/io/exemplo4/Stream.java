package com.oracle.whilabs.io.exemplo4;

import java.io.*;

public class Stream {
	public static void main(String[] args) throws IOException {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("source.txt");
			out = new FileOutputStream("dest.txt");
			int c;
			
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
		
	}
}
