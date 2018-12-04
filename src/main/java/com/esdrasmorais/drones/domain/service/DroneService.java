package com.esdrasmorais.drones.domain.service;

import java.util.List;

import com.esdrasmorais.ddd.service.Service;
import com.esdrasmorais.drones.domain.model.Drone;
import com.esdrasmorais.drones.domain.service.interfaces.IDroneService;
import com.esdrasmorais.drones.infrastructure.interfaces.IDroneRepository;

public class DroneService extends Service<Drone> implements IDroneService {

	private final IDroneRepository _droneRepository;
	
	public DroneService(IDroneRepository repository) {
		super(repository);
		this._droneRepository = repository;
	}

	@Override
	public List<Drone> findByName(String name) {
		Object[] object = new Object[] { name };
		return this._droneRepository.find("name", object);
	}
	
	public Boolean save(Drone drone) {
		return this._droneRepository.save(drone);
	}
	
}
