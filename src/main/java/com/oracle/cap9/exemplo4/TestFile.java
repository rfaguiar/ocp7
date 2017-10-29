package com.oracle.cap9.exemplo4;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		
		try {
			
			File file = new File("foo");//cria apenas um objeto, ainda não é um arquivo
			file.createNewFile();//cria o arquivo foo de fato, este metodo lança IOException
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
