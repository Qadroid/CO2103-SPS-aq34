package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Pet;

@Controller
public class PetController {

	@RequestMapping("/pet")
	public String addPet(@ModelAttribute Pet pet, Model model) {
		return "pet/form";
	}

	@RequestMapping(value = "/showPet", method = RequestMethod.POST)
	public String showGreeting(@ModelAttribute Pet pet) {
		return "pet/show";
	}
}
