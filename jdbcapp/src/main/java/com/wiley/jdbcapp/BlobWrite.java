package com.wiley.jdbcapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlobWrite {
	
	    public static void writeBlob(int candidateId, String filename) {
	        String updateSQL = "UPDATE candidates "
	                + "SET resume = ? "
	                + "WHERE id=?";

	        DBConnection dbcon = new DBConnection();
	        try (Connection conn = dbcon.createDBConnection();
	                PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {

	            File file = new File(filename);
	            FileInputStream input = new FileInputStream(file);

	            pstmt.setBinaryStream(1, input);
	            pstmt.setInt(2, candidateId);

	            System.out.println("Reading file " + file.getAbsolutePath());
	            System.out.println("Store file in the database.");
	            pstmt.executeUpdate();

	        } catch (SQLException | FileNotFoundException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeBlob(122, "Riti's Resume (12).pdf");

	}

}
