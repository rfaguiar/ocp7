package com.oracle.cap15.exemplo18;

import java.sql.ResultSet;
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
			jrs.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);
			jrs.setConcurrency(ResultSet.CONCUR_UPDATABLE);
			jrs.setCommand("SELECT * FROM AUTHOR");
			jrs.execute();
			
			jrs.absolute(5);
			jrs.deleteRow();
			System.out.println("DELETE ROW 5");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
