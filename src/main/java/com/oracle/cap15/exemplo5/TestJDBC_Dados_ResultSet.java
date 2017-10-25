package com.oracle.cap15.exemplo5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.oracle.cap15.ConstantesBD;

public class TestJDBC_Dados_ResultSet {

		public static void main(String[] args) {
			
			try (Connection conn = DriverManager.getConnection(ConstantesBD.URL.toString()
						, ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString());
					Statement stmt = conn.createStatement();) {
				
				String query = "SELECT TITLE, PUB_DATE, UNIT_PRICE FROM BOOK ";
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {
					String title = rs.getString("TITLE"); System.out.print(title + " ");
					Date pubDate = rs.getDate("PUB_DATE"); System.out.print(pubDate + " ");
					float price = rs.getFloat("UNIT_PRICE"); System.out.println(price);
				}
				
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
