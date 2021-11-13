package co2103.hw1.controller;

import java.util.Arrays;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Room;

public class RoomValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Room.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Room room = (Room) target;
		
		// Check to ensure name is not empty
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Room must have a name");

		
		// Check to ensure description is not empty
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "", "Room description cannot be empty");
		
		// Check to ensure category exists in list of valid categories
		if (!Arrays.asList(Hw1Application.roomCategories).contains(room.getCategory())) {
			errors.rejectValue("category", "", "Invalid room category");
		}
		
		// Check to ensure field guests has valid integer
		if (room.getGuests() > 0) {
			if (room.getGuests() > 12) {
				errors.rejectValue("guests", "", "Number of guests can only be between (including) 1 and 12");
			}
		} else {
			errors.rejectValue("guests", "", "Number of guests can only be between (including) 1 and 12");
		}
		
	}
}
