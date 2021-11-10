package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  

public class MainController {
	
	@RequestMapping("/greeting")
	public String exA(Model model) {
		model.addAttribute("value", "Hello Wordl!");
		return "show";
	}
	

}
