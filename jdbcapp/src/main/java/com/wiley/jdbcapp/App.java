package com.wiley.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void addCandidate(String firstName, String lastName, Date dob, String email, String phone,
			int[] skills) throws SQLException {

		Connection conn = null;
		PreparedStatement ps = null;
		PreparedStatement psSkills = null;
		ResultSet rs = null;

		try {
			DBConnection dbcon = new DBConnection();
			conn = dbcon.createDBConnection();

			conn.setAutoCommit(false);
			String sqlInsert = "INSERT INTO candidates(first_name, last_name, dob, phone, email) VALUES(?,?,?,?,?)";

			ps = conn.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setDate(3, dob);
			ps.setString(4, phone);
			ps.setString(5, email);
			
			int rowAffected = ps.executeUpdate();
			
			rs = ps.getGeneratedKeys();
			System.out.println("Generated keys" + rs);
			
			int candidateId = 0;
			if(rs.next())
				candidateId = rs.getInt(1);
			System.out.println("Candidate id: " + candidateId);
			
			if(rowAffected == 1) {
				String sqlSkillInsert = "INSERT INTO candidate_skills(candidate_id, skill_id) VALUES(?,?)";
				
				psSkills = conn.prepareStatement(sqlSkillInsert);
				
				for(int skillId: skills) {
					psSkills.setInt(1, candidateId);
					psSkills.setInt(2, skillId);
					
					psSkills.executeUpdate();
				}
				conn.commit();
			} else {
				System.out.println("roll back done");
				conn.rollback();
			}

		} catch (SQLException e) {
			try {
				if(conn != null)
					conn.rollback();
			} catch (SQLException e2) {
				System.out.println(e2.getMessage());
			}
		} finally {
			try {
				if(rs !=null) rs.close();
				if(ps !=null) ps.close();
				if(psSkills !=null) psSkills.close();
				if(conn !=null) conn.close();
				
			} catch (SQLException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}

	public static void main(String[] args) throws SQLException {
		int[] skills = {1,2,3};
		
		addCandidate("Venkat", "B", Date.valueOf("1990-02-04"), "bvsrao91@gmail.com", "9035351966", skills);
	}
    
	/*public static void main( String[] args )
    {
        EmployeeDao e = new EmployeeDaoImpl() ;
    	Scanner sc = new Scanner(System.in);
    	while(true)
    	{
    		System.out.println("1 : Add Employee");
        	System.out.println("2 : Show all employees");
        	System.out.println("3 : Show employee based on id");
        	System.out.println("4 : Update employee");
        	System.out.println("5 : delete employee");
        	System.out.println("6 : Exit");
        	
        	int n = sc.nextInt();
    		
    		if(n==1)
    		{
    			System.out.println("Enter employee id");
                int id = sc.nextInt();
                System.out.println("Enter employee name");
                String name = sc.next();
                System.out.println("Enter employee salary");
                int salary = sc.nextInt();
                System.out.println("Enter employee age");
                int age = sc.nextInt();
                Employee emp = new Employee(id,name,salary,age);
                try{
                	if(emp!=null) {
                		e.createEmployee(emp);
                	}
                	
                }catch(NullPointerException eo) {
                	eo.printStackTrace(); 
                }   
    		}
    		else if(n==2)
    		{
    			e.getAllEmployees();
    		}
    		else if(n==3)
    		{
    			System.out.println("Enter Employee Id");
    			int id = sc.nextInt();
    			e.getEmpByiD(id);
    		}
    		else if(n==4)
    		{
               System.out.println("Enter Employee Id");
    			int id = sc.nextInt();
                System.out.println("Enter Employee name");
    			
    			String name = sc.next();
    			
    			e.updateEmpNameById(id, name);
    		}
    		else if(n==5)
    		{
    			System.out.println("Enter Id");
    			 int id = sc.nextInt();
//    			 Employee emp = new Employee();
    			 e.getEmpByiD(id);
    			 try{
                 		e.deleteEmpById(id);
                 }catch(NullPointerException eo) {
                 	eo.printStackTrace(); 
                 }  
    			 
    		}
    		else if(n==6)
    		{
    			System.out.println("Exit");
    			System.exit(0);
    		}
    		else
    		{
    			System.out.println("Invalid Choice");
    		}
    	}*/

//        System.out.println( "Hello World!" );
//    	try {
//    		String driver="com.mysql.cj.jdbc.Driver";
//    		String url="jdbc:mysql://localhost:3306/wileyclassic";
//    		String username="root";
//    		String password= "Kochi@123";
//    		Class.forName(driver);
//    		Connection con= DriverManager.getConnection(url,username,password);
//    		System.out.println("Connection success");
//    		EmployeeDaoImpl e;
//    		
//    	}catch(Exception e) {
//    		e.printStackTrace();
//    	}
//    }
}
