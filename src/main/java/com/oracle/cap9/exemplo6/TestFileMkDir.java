package com.oracle.cap9.exemplo6;

import java.io.File;

public class TestFileMkDir {
	public static void main(String[] args) {
		File file = new File("mydir");//apenas criou o objeto file
		System.out.println(file.mkdir());//cria um diretorio de fato e retorna boolean em caso de sucesso
	}
}
