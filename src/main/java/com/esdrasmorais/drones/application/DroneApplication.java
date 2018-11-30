package com.esdrasmorais.drones.application;

import com.esdrasmorais.ddd.application.Application;
import com.esdrasmorais.ddd.service.IService;
import com.esdrasmorais.drones.domain.model.Drone;
import com.esdrasmorais.drones.domain.service.interfaces.IDroneService;

public class DroneApplication extends Application<Drone> {

	private IDroneService _droneService;
	
	public DroneApplication(IDroneService service) {
		super(service);
		this._droneService = service;
	}

}
