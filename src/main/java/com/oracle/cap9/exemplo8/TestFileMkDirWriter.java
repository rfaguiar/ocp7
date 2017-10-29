package com.oracle.cap9.exemplo8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFileMkDirWriter {
	public static void main(String[] args) {
		
		File mydir = new File("mydir");//objeto com o nome do direto
		File myfile = new File(mydir, "myFile.txt");//objeto que coloca um arquivo txt no direto mydir
		
		try {
			PrintWriter pw = new PrintWriter(myfile);//caso nã oexiste o direto e o arquivo sera criado neste momento
			pw.println("new stugg");//escreve texto no arquivo
			pw.flush();//descarrega dados do buffer/memoria para oarquivo
			pw.close();//fecha o arquivo e desaloca recursos
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
