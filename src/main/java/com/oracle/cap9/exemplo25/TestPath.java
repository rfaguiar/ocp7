package com.oracle.cap9.exemplo25;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
	public static void main(String[] args) {
		Path dir = Paths.get("/home/java");
		Path file = Paths.get("models/Model.pdf");
		
		System.out.println(dir.resolve(file));
	}
}
