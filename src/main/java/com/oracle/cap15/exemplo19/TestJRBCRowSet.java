package com.oracle.cap15.exemplo19;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

import com.oracle.cap15.ConstantesBD;

public class TestJRBCRowSet {
	public static void main(String[] args) {
		try (JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet()) {
			
			jrs.setUrl(ConstantesBD.URL.toString());
			jrs.setUsername(ConstantesBD.URL.toString());
			jrs.setPassword(ConstantesBD.PASSWORD.toString());
			jrs.setCommand("SELECT * FROM AUTHOR");
			
			jrs.moveToInsertRow();
			jrs.updateInt(ConstantesBD.AUTHOR_ID_AUTHOR.toString(), 1032);
			jrs.setString(ConstantesBD.FIRST_NAME_AUTHOR.toString(), "Michael");
			jrs.setString(ConstantesBD.LAST_NAME_AUTHOR.toString(), "Crichton");
			jrs.insertRow();
			jrs.moveToCurrentRow();
			System.out.println("LINE INSERTED");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
