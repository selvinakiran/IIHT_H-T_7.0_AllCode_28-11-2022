package com.emp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.Entity.Employee;
import com.emp.Service.IEmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private IEmployeeService employeeService;
	
	
	@PostMapping("/Add")
	 Integer  createEmployee(@RequestBody Employee employee) {
		Integer id = employeeService.saveEmployee(employee);
		System.out.println(id);
		return id;
	}
	
	@GetMapping("/getList")
	public List<Employee> getEmployee(){
		return employeeService.getAllEmployees();
	}

}
