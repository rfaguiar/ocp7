package com.oracle.cap10.exemplo8;

public class SalesTaxRates {
	
	public float salesRate;
	public float adjustedSalesRate;
	
	public float getSalesRate(String region) {
		salesRate = new DoTaxes().doColorado();
		return adjustedSalesRate;
	}
	
}
