package com.wiley.bookpub.util;

import java.sql.Connection;
import java.util.ResourceBundle;

public class DBConnection {
	private DBConnection() {}
	
	public static Connection getDBConnection() {
		Connection dbcon = null;
		
		ResourceBundle bundle= ResourceBundle.getBundle("db");
		
	}

}
