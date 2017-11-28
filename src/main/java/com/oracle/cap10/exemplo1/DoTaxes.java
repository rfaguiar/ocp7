package com.oracle.cap10.exemplo1;

public class DoTaxes {

	float rate;
	
	float doColorado () {
		SalesTaxRates str = new SalesTaxRates();
		rate = str.salesRate;
		
		return rate;
	}
	
}
