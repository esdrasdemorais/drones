package com.esdrasmorais.drones.ui;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esdrasmorais.drones.application.DroneApplication;
import com.esdrasmorais.drones.domain.model.Drone;

@RestController
@RequestMapping("/")
public class DroneController {
	@Autowired
	private Environment env;
		
	@RequestMapping("/drones")
	public List<String> getImages() {
//		List<Drone> images = Arrays.asList(
//			new Drone(1, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
//			new Drone(2, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
//			new Drone(3, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
//		return images;
		return null;
	}
}