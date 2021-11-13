package co2103.hw1.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Hotel;

public class HotelValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Hotel.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Hotel hotel = (Hotel) target;
		
		// Check to ensure ID is unique
		for (Hotel h : Hw1Application.hotels) {
			if (h.getId() == hotel.getId()) {
				errors.rejectValue("id", "", "A hotel with that value already exists");
			}
		}
		
		// Check to ensure name is not empty
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Hotel must have a name");
		
		// Check to ensure description is not empty
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "", "Hotel description cannot be empty");

		// Check to ensure description contains > 20 characters
		if (hotel.getDescription().length() < 20) {
			errors.rejectValue("description", "", "Hotel description must have more than 20 characters");
		}
		
		
	}
}
