package in.prakash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	@GetMapping("/home")
	public String showHome() {
		return "Home";
	}

}
