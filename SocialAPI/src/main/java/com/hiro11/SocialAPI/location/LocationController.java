package com.hiro11.SocialAPI.location;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
	@Autowired
	private LocationService locationService;

	@RequestMapping(value = "/locations")
	public List<Location> getAllLocations() {
		return locationService.getAllLocations();
	}
}
