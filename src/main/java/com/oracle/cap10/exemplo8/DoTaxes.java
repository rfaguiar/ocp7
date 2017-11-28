package com.oracle.cap10.exemplo8;

public class DoTaxes {
	
	float rate;
	
	float doColorado() {
		SalesTaxRates str = new SalesTaxRates();
		rate = str.salesRate;
		return rate * 50;
	}
	
}
