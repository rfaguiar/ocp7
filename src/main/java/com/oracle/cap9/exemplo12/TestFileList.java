package com.oracle.cap9.exemplo12;

import java.io.File;

public class TestFileList {
	public static void main(String[] args) {
		
		String[] files = new String[100];
		File search = new File("searchThis");
		files = search.list(); //cria a lista
		
		for (String fn : files) {
			System.out.println("found " + fn);//mostra o conteudo
		}
		
	}
}
