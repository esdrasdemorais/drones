package com.esdrasmorais.drones.ui;

import java.util.List;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.esdrasmorais.drones.application.DroneApplication;
import com.esdrasmorais.drones.application.RouteApplication;
import com.esdrasmorais.drones.application.interfaces.IDroneApplication;
import com.esdrasmorais.drones.application.interfaces.IRouteApplication;
import com.esdrasmorais.drones.domain.model.Drone;
import com.esdrasmorais.drones.domain.model.Route;

@RestController
@RequestMapping("/")
public class DroneController {
	@Autowired
	private Environment env;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private final DroneApplication droneApplication;
	
	public DroneController(DroneApplication droneApplication) {
		this.droneApplication = droneApplication;
	}
	
	@RequestMapping("/drones")
	public List<Drone> getDrones() {
		//Arrays.asList(
		List<Drone> drones = this.droneApplication.findAll();
		return drones;
	}
	
    @RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Drone> save(@RequestBody Drone drone) {
		if (this.droneApplication.save(drone))
			return ResponseEntity.status(HttpStatus.CREATED).build();
		else
			return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	}
    
    @RequestMapping("/{id}")
	public List<Route> getRoutes(@PathVariable final Long id) {
		// create gallery object
		Drone drone = this.droneApplication.findById(id);
		List<Route> routes = restTemplate.getForObject(
			"http://route-service/routes/", List.class
		);
		return routes;
	}
}