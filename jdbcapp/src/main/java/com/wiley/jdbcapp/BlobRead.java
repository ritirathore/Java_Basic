package com.wiley.jdbcapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BlobRead {

	
	    public static void readBlob(int candidateId, String filename) {
	        String selectSQL = "SELECT resume FROM candidates WHERE id=?";
	        ResultSet rs = null;

	        DBConnection dbcon = new DBConnection();
	        try (Connection conn = dbcon.createDBConnection();
	                PreparedStatement pstmt = conn.prepareStatement(selectSQL);) {
	            pstmt.setInt(1, candidateId);
	            rs = pstmt.executeQuery();

	            File file = new File(filename);
	            FileOutputStream output = new FileOutputStream(file);

	            System.out.println("Writing to file " + file.getAbsolutePath());
	            while (rs.next()) {
	                InputStream input = rs.getBinaryStream("resume");
	                byte[] buffer = new byte[1024];
	                while (input.read(buffer) > 0) {
	                    output.write(buffer);
	                }
	            }
	        } catch (SQLException | IOException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            try {
	                if (rs != null) {
	                    rs.close();
	                }
	            } catch (SQLException e) {
	                System.out.println(e.getMessage());
	            }
	        
	        }
	    }
	    
	    public static void main(String[] args) {
	        // 
	        readBlob(122, "Riti's Resume (12).pdf");
	    }

	
	

}
