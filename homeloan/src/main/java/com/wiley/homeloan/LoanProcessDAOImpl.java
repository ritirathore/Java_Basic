package com.wiley.homeloan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class LoanProcessDAOImpl implements LoanProcessDAO{
	
	public void getInformation(User u, LoanProcess lp) {
		//annual income doc
//		cibil score enum/ final
		final int cibil_score;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your annual income:");
		int annual_income = sc.nextInt();
		
		DBConnection dbcon = new DBConnection();
		String document = lp.getDoc();
		int id= u.getUser_id();
		
		String selectLoanid="select loan_id from loan where user_id=id";
		ResultSet rs1= null;
		Connection conn= dbcon.createDBConnection();
		PreparedStatement ps1= conn.prepareStatement(selectLoanid);
		rs1= ps1.executeQuery();
		int loanid= rs1.getInt("loan_id");
		
		
		String selectSQL = "SELECT document FROM loan_process WHERE loan_id=loanid";
        ResultSet rs = null;
        
        
        try (Connection conn = dbcon.createDBConnection();
                PreparedStatement pstmt = conn.prepareStatement(selectSQL);) {
            pstmt.setInt(1, loanid);
            rs = pstmt.executeQuery();

            File file = new File(document);
            FileOutputStream output = new FileOutputStream(file);

//            System.out.println("Writing to file " + file.getAbsolutePath());
            while (rs.next()) {
                InputStream input = rs.getBinaryStream("document");
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

}
