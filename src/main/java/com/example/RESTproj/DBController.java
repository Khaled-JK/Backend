package com.example.RESTproj;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBController {

	public ArrayList<Employee> getAllEmployees(){
		ArrayList<Employee> employees = new ArrayList<Employee>();
		try {
			Connection con = DatabaseConnection.initializeDatabase();
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM EMPLOYEES";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String id = rs.getString("ID");
				String fname = rs.getString("FNAME");
				String lname = rs.getString("LNAME");
				String dob = rs.getString("DOB");
				String salary = rs.getString("SALARY");
				Employee temp = new Employee(id,fname,lname,dob,salary);
				employees.add(temp);
			}
			con.close();	
		}catch( Exception e) { e.printStackTrace(); }
		return employees;
	}
	
	public Employee getEmployeeByID(String ID) {
		Employee employee = new Employee();
		
		try {
			Connection con = DatabaseConnection.initializeDatabase();
			Statement stmt = con.createStatement();
			String sql = String.format("SELECT * FROM EMPLOYEES WHERE ID = '%s'",ID);
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String id = rs.getString("ID");
				String fname = rs.getString("FNAME");
				String lname = rs.getString("LNAME");
				String dob = rs.getString("DOB");
				String salary = rs.getString("SALARY");
				
				employee.setId(id);
				employee.setFirstname(fname);
				employee.setLastname(lname);
				employee.setSalary(salary);
				employee.setDob(dob);
				
			}
			
			con.close();
		}catch( Exception e) { e.printStackTrace(); }
		
		return employee;
	}
	
	public boolean insertEmployee(Employee e) {
		boolean inserted = false;
		try {
			Connection con = DatabaseConnection.initializeDatabase();
			Statement stmt = con.createStatement();
			String sql = String.format("INSERT INTO EMPLOYEES VALUES('%s','%s','%s','%s','%s')",e.getId(),e.getFirstname(),e.getLastname(),e.getDob(),e.getSalary());
			int result = stmt.executeUpdate(sql);
			if(result == 1) inserted = true;
			con.close();
		}catch( Exception ee) { ee.printStackTrace(); }
		return inserted;
		
		
	}
	
	public boolean insertMember(Member member) {
		boolean success = false;
		
	
		try {
			
			Connection conn = DatabaseConnection.initializeDatabase();
			Statement stmt = conn.createStatement();
			String sql = String.format("INSERT INTO member VALUES('%s','%s','%s','%s','%s','%s','%s')",member.getFirstname(),member.getLastname(),member.getUsername(),member.getEmail(),member.getPassword(),member.getRole(),member.getIBAN());
			int result = stmt.executeUpdate(sql);
			if(result == 1) success = true;
			
			conn.close();
		}catch( Exception e) { e.printStackTrace();}
	
		return success;
	}
	
	public boolean insertFilm(Film film) {
		boolean success = false;
		
		try {
			
			Connection conn = DatabaseConnection.initializeDatabase();
			Statement stmt = conn.createStatement();
			String sql = String.format("INSERT INTO Films VALUES(%s,'%s','%s','%s','%s','%s','%s','%s')",film.getfID(),film.getTitle(),film.getDirector(),film.getYear(),film.getChar1(),film.getChar2(),film.getChar3(),film.getGenre());
			int result = stmt.executeUpdate(sql);
			if(result == 1) success = true;
			
			conn.close();
		}catch( Exception e) { e.printStackTrace();}
	
		return success;
	}
}
