package com.oracle.cap15.exemplo17;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

import com.oracle.cap15.ConstantesBD;

public class TestJDBCRowSet {
	public static void main(String[] args) {
		try (JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet();) {
			
			jrs.setCommand("SELECT * FROM AUTHOR");
			jrs.setUrl(ConstantesBD.URL.toString());
			jrs.setUsername(ConstantesBD.USER.toString());
			jrs.setPassword(ConstantesBD.PASSWORD.toString());
			jrs.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);
			jrs.setConcurrency(ResultSet.CONCUR_UPDATABLE);
			jrs.execute();
			while (jrs.next()) {
				System.out.print(jrs.getObject(1) + " ");
				System.out.println(jrs.getObject(2));
			}
			
			jrs.last();
			jrs.updateString(ConstantesBD.FIRST_NAME_AUTHOR.toString(), "Raquel");
			jrs.updateRow();
			System.out.println("UPDATE LAST REG ");
			
			jrs.beforeFirst();
			while (jrs.next()) {
				System.out.print(jrs.getObject(1));
				System.out.println(jrs.getObject(2));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
