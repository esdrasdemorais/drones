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
public class RouteController {
	@Autowired
	private Environment env;

	@Autowired
	private RestTemplate restTemplate;
	
	private final RouteApplication routeApplication;
	
	public RouteController(RouteApplication routeApplication) {
		this.routeApplication = routeApplication;
	}
	
	@RequestMapping("/routes")
	public List<Route> getRoutes() {
		//Arrays.asList(
		List<Route> routes = this.routeApplication.findAll();
		return routes;
	}
	
    @RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Route> save(@RequestBody Route route) {
		if (this.routeApplication.save(route))
			return ResponseEntity.status(HttpStatus.CREATED).build();
		else
			return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	}
    
	@RequestMapping("/{id}")
	public Route getRoute(@PathVariable final Long id) {
		return this.routeApplication.findById(id);
	}
}