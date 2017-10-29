package com.oracle.cap9.exemplo21;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
	public static void main(String[] args) {
		Path path = Paths.get("/home/rogerio/LIVRO OCA-OCP.txt");
		System.out.println("getFileName: " + path.getFileName());
		System.out.println("getName(1): " + path.getName(1));
		System.out.println("gatNameCount: " + path.getNameCount());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getRoot: " + path.getRoot());
		System.out.println("subPath(0, 2): " + path.subpath(0, 2));
		System.out.println("toString: " + path.toString());
		
	}
}