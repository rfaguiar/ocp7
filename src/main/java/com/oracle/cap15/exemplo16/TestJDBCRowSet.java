package com.oracle.cap15.exemplo16;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

import com.oracle.cap15.ConstantesBD;

public class TestJDBCRowSet {
	public static void main(String[] args) {
		try (JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet();) {
			
			String query = "SELECT * FROM AUTHOR";
			jrs.setCommand(query);
			jrs.setUrl(ConstantesBD.URL.toString());
			jrs.setUsername(ConstantesBD.USER.toString());
			jrs.setPassword(ConstantesBD.PASSWORD.toString());
			jrs.execute();
			while (jrs.next()) {
				System.out.print(jrs.getObject(1) + " ");
				System.out.println(jrs.getObject(2));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
