package in.prakash.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.prakash.Repository.EmployeeRepo;
import in.prakash.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private  EmployeeRepo erepo;

	@Override
	public Integer saveEmployee(Employee e) {
		//calculations
		double esal = e.getEsal();
		double hra = esal * 20/100.0;
		double da = esal * 10/100.0;
		e.setHra(hra);
		e.setDa(da);
		
		
		//save employee
		e = erepo.save(e);
		return e.getEid();
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return erepo.findAll();
	}
	
	

}
