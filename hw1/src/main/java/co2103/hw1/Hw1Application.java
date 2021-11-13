package co2103.hw1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co2103.hw1.domain.Hotel;
import co2103.hw1.domain.Room;

@SpringBootApplication
public class Hw1Application implements CommandLineRunner {
	
	public static List<Hotel> hotels = new ArrayList<>();

	// Create array to test room validation
	public static String[] roomCategories = new String[] { "suite", "penthouse", "double" };


	public static void main(String[] args) {
		SpringApplication.run(Hw1Application.class, args);
	}

	@Override
	public void run(String... args) {
		
		// Create hotel
		Hotel hotel = new Hotel();
		hotel.setId(12);
		hotel.setName("The Grand Budapest Hotel");
		hotel.setDescription("It's a nice hotel with interesting staff");
		
		List<Room> roomsList = new ArrayList<>();
		
		// Create rooms, and add rooms to rooms list
		Room room = new Room();
		room.setName("Broom Closet");
		room.setDescription("Bed not included");
		room.setCategory("suite");
		room.setGuests(1);
		roomsList.add(room);
		
		room = new Room();
		room.setName("Luxury Suite");
		room.setDescription("Peak of luxury for 2");
		room.setCategory("penthouse");
		room.setGuests(2);
		roomsList.add(room);
		
		// Add rooms list to hotel object
		hotel.setRooms(roomsList);
		
		// Add hotel object to hotels list
		hotels.add(hotel);
	}
	
}
