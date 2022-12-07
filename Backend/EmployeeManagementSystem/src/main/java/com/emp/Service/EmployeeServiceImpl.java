package com.emp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import com.emp.Entity.Employee;
import com.emp.Repo.IEmployeeRepo;
import com.emp.exception.ResourceNotFoundException;


@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepo employeeRepo;

	@Override
	public Integer saveEmployee(Employee employee) {
		Employee saveEmployee = employeeRepo.save(employee);
		return saveEmployee.getId();
	}

	@Override
	public List<Employee> getAllEmployees() {
			return employeeRepo.findAll();
	}

	@Override
	public Optional<Employee> getemployee(Integer id) {
		return employeeRepo.findById(id);
	}

	@Override
	public void deleteEmployee(Integer id) {
		 employeeRepo.deleteById(id);
	}

	@Override
	public Employee UpdateEmployee(Employee emp,Integer id) {
		// lets check whether the employee exist or not
		Employee existingEmp=employeeRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Employee","id",id));
		
		existingEmp.setEname(emp.getEname());
		existingEmp.setEposition(emp.getEposition());
		existingEmp.setEmail(emp.getEmail());
		existingEmp.setSalary(emp.getSalary());
		
		employeeRepo.save(existingEmp);
		return existingEmp;
	}


	

	

}
