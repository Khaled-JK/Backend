package com.example.RESTproj;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHandler {

	DBController ctrl = new DBController();
	
	@GetMapping("/employees")
	public ArrayList<Employee> returnAllEmployees(){
		return ctrl.getAllEmployees();
	}
	
	@GetMapping("/employees/{ID}")
	public Employee getEmployee(@PathVariable("ID") String id) {
		return ctrl.getEmployeeByID(id);
	}
	
	@PostMapping("/employees/register")
	public String registerEmployee(@RequestBody  Employee employee) {
		boolean result = ctrl.insertEmployee(employee);
		if(result) return "Employee registered successfully";
		else return "Error upon registration";
	}
	
	@PostMapping("/members/register")
	public String registerMember(@RequestBody  Member member) {
		boolean result = ctrl.insertMember(member);
		if(result) return "Memebr registered successfully";
		else return "Error upon registration";
	}
	
	@PostMapping("/films/add")
	public String addFilm(@RequestBody Film film) {
		boolean result = ctrl.insertFilm(film);
		if(result) return "Movie registered successfully";
		else return "Error upon registration";
	}
}
