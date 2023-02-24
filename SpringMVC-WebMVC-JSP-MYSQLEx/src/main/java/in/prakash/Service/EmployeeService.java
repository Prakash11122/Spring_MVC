package in.prakash.Service;

import java.util.List;

import in.prakash.model.Employee;

public interface EmployeeService {
	
	Integer saveEmployee(Employee e);
	List<Employee> getAllEmployee();

}
