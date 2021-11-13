package co2103.hw1.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Hotel;

@Controller
public class HotelController {
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(new HotelValidator());
	}
	
	@RequestMapping(value = "/hotels", method = RequestMethod.GET)
	public String listHotels(@ModelAttribute Hotel hotel, Model model) {
		model.addAttribute("hotels", Hw1Application.hotels);
		return "hotels/list";
	}
	
	@GetMapping("/newHotel")
	public String hotelForm(Model model) {
		model.addAttribute("hotel", new Hotel());
		return "hotels/form";
	}
	
	@PostMapping(value = "/addHotel")
	public String addHotel(@Valid @ModelAttribute Hotel hotel, BindingResult result) {
		
		if (result.hasErrors()) {
			return "hotels/form";
		}
		
		Hw1Application.hotels.add(hotel);
		return "redirect:/hotels";
	}
}
