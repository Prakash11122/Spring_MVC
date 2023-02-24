package in.prakash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.prakash.Service.EmployeeService;
import in.prakash.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	//show reg page
	@GetMapping("/register")
	public String showReg() {
		return "EmployeeReg";
	}
	@PostMapping("save")
	//save employee data
	public String saveEmp(
			@ModelAttribute Employee employee,
			Model model
			) {
		//cal service layer
	Integer eid	= service.saveEmployee(employee);
	String message = "Employee '"+eid+"'saved";
	model.addAttribute("msg", message);
		
		return "EmployeeReg";
	}
	//featch data to ui
	@GetMapping("/all")
	public String showAllEmps(Model model) {
		//call service to fetch data
	List<Employee> list = service.getAllEmployee();
	//send to ui
	model.addAttribute("list", list);
		return "empData";
	}

}
