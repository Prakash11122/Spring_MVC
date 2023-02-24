package in.prakash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.prakash.entity.StudentEntity;

@Controller
public class StudentController {
	//show registe data
	@GetMapping("/register")
	public String studentReg() {
		return "studentData";
		
		//read from data
		
	}
	
	@PostMapping("/add")
	public String readData(
			@ModelAttribute StudentEntity studentEntity,
			Model model
			) 
	{
		System.out.println(studentEntity);
		model.addAttribute("std", studentEntity);
		return "stdData";
	}

}
