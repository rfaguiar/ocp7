package com.oracle.cap9.exemplo22;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
	public static void main(String[] args) {
		Path path = Paths.get("/home/rogerio/LIVRO OCA-OCP.txt");
		int spaces = 1;
		for (Path subPath : path) {
			System.out.format("%" + spaces + "s%s%n", "", subPath);
			spaces += 2;
		}
	}
}