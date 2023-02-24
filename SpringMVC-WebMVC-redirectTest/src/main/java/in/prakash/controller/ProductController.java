package in.prakash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	@GetMapping("/export")
	public String exportData() {
		System.out.println("FROM EXPORT DATA");
		return "redirect:show";
	}
	@GetMapping("/show")
	public String findMsg() {
		System.out.println("FROM FIND MSG DATA");
		return "Data";
	}

}
