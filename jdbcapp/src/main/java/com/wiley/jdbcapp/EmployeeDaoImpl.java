package com.wiley.jdbcapp;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class EmployeeDaoImpl implements EmployeeDao {

	
		Connection conn;
		
	
	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		conn = DBConnection.createDBConnection();
		String query="INSERT INTO EMPLOYEE values(?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1,emp.getAge());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4,emp.getAge());
			int res=ps.executeUpdate();
			if(res!=0)
				System.out.println("insertion successful");
			else {
				System.out.println("not inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	public void getAllEmployees() {
		// TODO Auto-generated method stub
		conn = DBConnection.createDBConnection();
		String query="SELECT * FROM EMPLOYEE";
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.format("%s\t%s\t%s\t%s\t","ID","NAME","SALARY","AGE");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		try {
	
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t",rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		
	}

	public void getEmpByiD(int id) {
		// TODO Auto-generated method stub
		conn = DBConnection.createDBConnection();

		String query = "SELECT * FROM employee where id = "+id;

		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\\t",
						rs.getInt(1),
						rs.getString(2),
						rs.getDouble(3),
						rs.getInt(4));

			}
		} catch (Exception e) {
			e.printStackTrace();		}

		
	}

	public void updateEmpNameById(int id, String name) {
		// TODO Auto-generated method stub
		conn = DBConnection.createDBConnection();
		String query="update employee set name=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, id);
			int res=ps.executeUpdate();
			if(res!=0)
				System.out.println("updation successful");
			else {
				System.out.println("not updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

		
	}

	public void deleteEmpById(int id) {
		// TODO Auto-generated method stub
		conn = DBConnection.createDBConnection();
		String query="delete from employee where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1, id);
			int res=ps.executeUpdate();
			if(res!=0)
				System.out.println("deletion successful");
			else {
				System.out.println("not deleted");
			}
		} catch (Exception e) {
		e.printStackTrace();
			// TODO: handle exception
		}

	}

	


}