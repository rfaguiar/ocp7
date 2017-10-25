package com.oracle.cap15.exemplo21;

import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import com.oracle.cap15.ConstantesBD;

public class TestJDBCCachedRowSet {
	public static void main(String[] args) {
		try (CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {
			
			crs.setUrl(ConstantesBD.URL.toString());
			crs.setUsername(ConstantesBD.USER.toString());
			crs.setPassword(ConstantesBD.PASSWORD.toString());
			crs.setCommand("SELECT * FROM AUTHOR");			
			crs.execute();
			
			//faz alterações
			
			//syncroniza alterações
			crs.acceptChanges();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
