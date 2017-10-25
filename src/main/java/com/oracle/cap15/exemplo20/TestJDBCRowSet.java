package com.oracle.cap15.exemplo20;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

import com.oracle.cap15.ConstantesBD;

public class TestJDBCRowSet {
	public static void main(String[] args) {
		try (JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet()) {
			
			jrs.setUrl(ConstantesBD.URL.toString());
			jrs.setUsername(ConstantesBD.USER.toString());
			jrs.setPassword(ConstantesBD.PASSWORD.toString());
			jrs.setCommand("SELECT * FROM AUTHOR");
			
			jrs.addRowSetListener(new MyRowSetListener());
			
			jrs.execute();
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
