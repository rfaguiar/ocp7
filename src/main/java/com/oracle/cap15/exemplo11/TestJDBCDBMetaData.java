package com.oracle.cap15.exemplo11;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.oracle.cap15.ConstantesBD;

public class TestJDBCDBMetaData {
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(ConstantesBD.URL.toString(),
					ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString());) {
			
			DatabaseMetaData dbmd = conn.getMetaData();
			
			if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
				System.out.print("Supports TYPE_FORWARD_ONLY");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
					System.out.println(" and supports CONCUR_UPDATABLE");
				}
			}
			
			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
				System.out.print("Supports TYPE_SCROLL_INSENSITIVE");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					System.out.println(" and supports CONCUR_UPDATABLE");
				}
			}
			
			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
				System.out.print("Supports TYPE_SCROLL_SENSITIVE");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					System.out.println(" and supports CONCUR_UPDATABLE");
				}
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
