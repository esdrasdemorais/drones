package com.esdrasdemorais.drones.application;

//import java.util.List;

import com.esdrasmorais.ddd.application.Application;
import com.esdrasdemorais.drones.application.interfaces.IDroneApplication;
import com.esdrasdemorais.drones.domain.model.Drone;
import com.esdrasdemorais.drones.domain.service.interfaces.IDroneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.context.annotation.Lazy;

@Component
public class DroneApplication extends Application<Drone>
	implements IDroneApplication
{
	private IDroneService _droneService;
	
	public DroneApplication(IDroneService service) {
	    super(service);
	    _droneService = service;
	}

//	public List<Drone> findAll() {
//		return this._droneService.findAll();
//	}
//	
//	public Boolean save(Drone drone) {
//		return this._droneService.save(drone);
//	}
}
