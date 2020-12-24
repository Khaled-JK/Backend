package com.example.RESTproj;

public class Member {
	
	private String firstname, lastname, username, email, password, role, IBAN;
	
	

	public Member() {
		super();
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public String getIBAN() {
		return IBAN;
	}



	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	
	public void print() {
		
		System.out.println("Firstname: " + firstname);
		
		System.out.println("Lastname: " + lastname);
		
		System.out.println("UserName: " + username);
		
		System.out.println("Email: " + email);

		System.out.println("Password: " + password);
		
		System.out.println("Role: " + role);
		
		System.out.println("IBAN: " + IBAN);
		
	}
	
	

}
