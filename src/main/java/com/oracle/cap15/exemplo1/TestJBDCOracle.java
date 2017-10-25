package com.oracle.cap15.exemplo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.cap15.ConstantesBD;

public class TestJBDCOracle {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(ConstantesBD.URL.toString(), ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString());
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER");){
			
			while (rs.next()) {
				System.out.print(rs.getInt(ConstantesBD.CUSTOMER_ID.toString()) + " ");
				System.out.print(rs.getString(ConstantesBD.FIRST_NAME_CUSTOMER.toString()) + " ");
				System.out.print(rs.getString(ConstantesBD.LAST_NAME_CUSTOMER.toString()) + " ");
				System.out.print(rs.getString(ConstantesBD.EMAIL.toString()) + " ");
				System.out.println(rs.getString(ConstantesBD.PHONE.toString()));				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
