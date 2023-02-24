package in.prakash.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class EmployeeController {
	
	@GetMapping("/home")
	public String readData(
			          @RequestParam("eid") int id,
			          @RequestParam("ename") String name,
			          Model model
			
			) {
		model.addAttribute("eid", id);
		model.addAttribute("ename", name);
		return "EmpData";
	}

}
