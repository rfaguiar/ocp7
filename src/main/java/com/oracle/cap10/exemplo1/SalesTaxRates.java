package com.oracle.cap10.exemplo1;

public class SalesTaxRates {
	
	public float salesRate;
	public float adjustedSalesRates;
	
	public float getSalesRate(String region) {
		
		salesRate = new DoTaxes().doColorado();
		
		return adjustedSalesRates;
	}

}
