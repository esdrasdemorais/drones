package com.esdrasmorais.drones.application;

//import java.util.List;

import com.esdrasmorais.ddd.application.Application;
import com.esdrasmorais.drones.application.interfaces.IDroneApplication;
import com.esdrasmorais.drones.domain.model.Drone;
import com.esdrasmorais.drones.domain.service.interfaces.IDroneService;

public class DroneApplication extends Application<Drone>
	implements IDroneApplication
{
	//private IDroneService _droneService;
	
	public DroneApplication(IDroneService service) {
		super(service);
		//this._droneService = service;
	}
//	public List<Drone> findAll() {
//		return this._droneService.findAll();
//	}
//	
//	public Boolean save(Drone drone) {
//		return this._droneService.save(drone);
//	}
}