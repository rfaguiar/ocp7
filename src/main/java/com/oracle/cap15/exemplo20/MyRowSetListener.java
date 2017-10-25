package com.oracle.cap15.exemplo20;

import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;

public class MyRowSetListener implements RowSetListener {

	@Override
	public void rowSetChanged(RowSetEvent event) {
		if (event.getSource() instanceof RowSet) {
			try {
				((RowSet) event.getSource()).execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void rowChanged(RowSetEvent event) {}

	@Override
	public void cursorMoved(RowSetEvent event) {}

}
