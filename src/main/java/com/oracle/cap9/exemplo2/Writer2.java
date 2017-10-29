package com.oracle.cap9.exemplo2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer2 {
	public static void main(String[] args) {
		try {
			//para armazenar a entrada
			char[] in = new char[50];
			int size = 0;
			
			//Apenas um objeto
			File file = new File("fileWriter2.txt");
			
			//cria um arquivo real e um objeto FileWriter
			FileWriter fw = new FileWriter(file);
			
			//Escreve caracteres no arquivo
			fw.write("howdy\nfolks\n");
			
			//Descarrega tudo antes de fechar
			fw.flush();
			
			//Fecha o arquivo quando terminar
			fw.close();
			
			//Cria um objeto FileReader
			FileReader fr = new FileReader(file);
			
			//Lê o arquivo inteiro
			size = fr.read(in);
			
			//Quantos bytes foram lidos
			System.out.print(size + " ");
			
			//Exibe o array
			for (char c : in) {
				System.out.print(c);
			}
			
			//Novamente fecha o arquivo ao terminar
			fr.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
