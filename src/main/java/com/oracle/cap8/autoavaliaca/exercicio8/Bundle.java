package com.oracle.cap8.autoavaliaca.exercicio8;

import java.util.ListResourceBundle;

public class Bundle extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] {{"123", "456"}};
	}

}
