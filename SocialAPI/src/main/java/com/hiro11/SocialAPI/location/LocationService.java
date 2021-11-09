package com.hiro11.SocialAPI.location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LocationService {
	Location location1 = new Location("l1", "Lagos");
	Location location2 = new Location("l2", "Asaba");
	Location location3 = new Location("l3", "Budapest");

	//List<Location> locations = Arrays.asList(location1, location2, location3);
	List<Location> locations = new ArrayList<>(Arrays.asList(location1, location2, location3));

	public List<Location> getAllLocations() {

		return locations;
	}
	
	public Location getLocation(String id) {
	    Location location = locations.stream()
		.filter(t -> id.equals(t.getId()))
		.findFirst()
		.orElse(null);
			
	    return location;
	}
	
	public void addLocation(Location location) {
	     locations.add(location);
	}
	
}
