package com.emp.Service;

import java.util.List;
import java.util.Optional;

import com.emp.Entity.Employee;

public interface IEmployeeService {
	
	Integer saveEmployee (Employee  employee);
	
	public List<Employee> getAllEmployees();
	
	Optional<Employee> getemployee(Integer id);
	
	public void deleteEmployee(Integer id);
	
	Employee UpdateEmployee(Employee  employee,Integer id);

}
