package com.esdrasmorais.drones.domain.service;

import java.util.List;

import com.esdrasmorais.ddd.repository.interfaces.IRepository;
import com.esdrasmorais.ddd.service.Service;
import com.esdrasmorais.drones.domain.model.Drone;
import com.esdrasmorais.drones.domain.service.interfaces.IDroneService;

public class DroneService extends Service<Drone> implements IDroneService {

	private IRepository<Drone> _droneRepository = null;
	
	public DroneService(IRepository<Drone> repository) {
		super(repository);
		this._droneRepository = repository;
	}

	@Override
	public List<Drone> findByName(String name) {
		// TODO Auto-generated method stub
		Object[] object = new Object[1];
		object[0] = name;
		return this._droneRepository.find("name", object);
	}

}
