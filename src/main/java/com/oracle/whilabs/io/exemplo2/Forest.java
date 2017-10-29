package com.oracle.whilabs.io.exemplo2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Forest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	Animal animal = new Animal();
	
	public static void main(String[] args) {
		Forest forest = new Forest();
		
		try {
			FileOutputStream fs = new FileOutputStream("Forest.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(forest);
			os.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
