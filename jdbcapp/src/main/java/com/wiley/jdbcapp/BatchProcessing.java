package com.wiley.jdbcapp;

import java.sql.*;

public class BatchProcessing {
public static void main(String[] args) throws SQLException {
	Connection connection=null;
	
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:8088/";
			String username = "root";
			String password = "Kochi@123";
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {

		}
	Statement st=connection.createStatement();
	connection.setAutoCommit(false);
	st.addBatch("insert into emp1 values(13,'rishika')");
	st.addBatch("insert into emp1 values(14,'riya')");
	st.addBatch("insert into emp1 values(15,'rose')");
	st.addBatch("insert into emp1 values(16,'rohan')");
//	st.addBatch("SELECT * FROM EMP1");
	st.executeBatch();
//	connection.rollback();
	connection.commit();
}
}