package co2103.hw1.controller;

import java.util.ArrayList;
import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Hotel;
import co2103.hw1.domain.Room;

@Controller
public class RoomController {
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(new RoomValidator());
	}
	
	@GetMapping(value = "/rooms")
	public String listRooms(@ModelAttribute Room room, Model model, @RequestParam int hotel) {
		
		// Initialise a variable to hold correct hotel object
		Hotel theHotel = null;
		
		// Attach correct hotel object to theHotel
		for (Hotel h : Hw1Application.hotels) {
			if (h.getId() == hotel) {
				theHotel = h;
				break;
			}
		}
		
		model.addAttribute("rooms", theHotel.getRooms());
		model.addAttribute("hotelId", theHotel.getId());
		
		return "rooms/list";
	}
	
	@RequestMapping("/newRoom")
	public String roomForm(@ModelAttribute Room room, @RequestParam int hotel, Model model) {
		
		model.addAttribute("room", new Room());
		
		model.addAttribute("hotel", hotel);
		
		return "rooms/form";
	}
	
	@PostMapping(value = "/addRoom")
	public String addRoom(@Valid @ModelAttribute Room room, BindingResult result, @RequestParam int hotel) {
		
		if (result.hasErrors()) {
			return "rooms/form";
		}
		
		// Initialise a variable to hold correct hotel object
		Hotel theHotel = null;
				
		// Attach correct hotel object to theHotel
		for (Hotel h : Hw1Application.hotels) {
			if (h.getId() == hotel) {
				theHotel = h;
				break;
			}
		}
		
		// Add room to hotel
		if (theHotel != null && room != null && theHotel.getRooms() != null) {
			theHotel.getRooms().add(room);
		} else {
			List<Room> roomList = new ArrayList<Room>();
			roomList.add(room);
			theHotel.setRooms(roomList);
		}
		
		return "redirect:/hotels";
	}
}
