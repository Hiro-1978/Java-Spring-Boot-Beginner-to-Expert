package com.hiro11.SocialAPI.location;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
	@Autowired
	private LocationService locationService;

	/*@RequestMapping(value = "/locations")
	public List<Location> getAllLocations() {
		return locationService.getAllLocation();
	}*/
	
	@RequestMapping(value = "/locations")
	 public String getAllLocations(Model model) 
	 {				
		model.addAttribute("locations", locationService.getAllLocation());		
		return "locations";		
	 }
	
	//Get Method
	@RequestMapping(value = "/locations/{id}")
	public Optional<Location> getLocation(@PathVariable String id) {
		return locationService.getLocation(id);		
	}
	
	//Get Method
	@RequestMapping(value = "/locations/name/{name}")
	 public List<Location> getLocationByName(@PathVariable String name) {
	 	return locationService.getLocationsByName(name);
	 }
	
	//Post Method
	@RequestMapping(method=RequestMethod.POST, value="/locations")
	public void addLocation(@RequestBody Location location) {
		locationService.addLocation(location);
	}
	
	//Update Method
	@RequestMapping(value = "/locations/{id}", method = RequestMethod.PUT)
	public void updateLocation(@RequestBody Location location, @PathVariable String id) {
	     locationService.updateLocation(id, location);
	}
	
	//Delete Method
	@RequestMapping(value = "/location/{id}", method = RequestMethod.DELETE)
	 public void deleteLocation(@PathVariable String id) {
	     locationService.deleteLocation(id);
	 }
	
}
