package co2103.hw1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "start";
	}
	
	
	
}