package com.oracle.cap10.exemplo14;

public class FactoryImpl extends Factory {

	@Override
	public BookDao createDao() {
		
		if (Util.isTestMode()) {
			return new InMemoryBookDao();
		} else {
			return new OracleBookDao();
		}
	}
	
}
