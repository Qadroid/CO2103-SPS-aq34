package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@RequestMapping("/greet")
	public String greet() {
		return "greet/form";
	}

	@RequestMapping(value = "/showGreeting", method = RequestMethod.POST)
	public String showGreeting(@RequestParam String user, Model model) {
		model.addAttribute("user", user);
		return "greet/show";
	}
}
