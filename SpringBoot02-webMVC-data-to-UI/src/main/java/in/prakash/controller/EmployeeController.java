package in.prakash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.prakash.entity.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/show")
	public String showData(Model model) {
		System.out.println(model.getClass().getName());
		
		//key(String), value(object)
		model.addAttribute("code","nit");
		model.addAttribute("version", 3.3);
		
		//----------object data------------
		
		Employee employee = new Employee();
		employee.setEmpId(500);
		employee.setEmpName("prakash");
		employee.setEmpSal(3400.00);
		
		model.addAttribute("emp", employee);
		
		
		return "empdata";  
		
		
	}

}
