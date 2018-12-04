package com.esdrasmorais.drones.infrastructure;

import java.util.List;

import com.esdrasmorais.ddd.repository.MongoRepository;
import com.esdrasmorais.ddd.repository.interfaces.IClient;
import com.esdrasmorais.ddd.repository.interfaces.IContext;
import com.esdrasmorais.ddd.repository.interfaces.IDb;
import com.esdrasmorais.drones.domain.model.Drone;
import com.esdrasmorais.drones.infrastructure.interfaces.IDroneRepository;

public class DroneRepository extends MongoRepository<Drone> 
	implements IDroneRepository
{
	public DroneRepository(IContext context, IClient client, IDb db) {
		super(context, client, db);
	}

	@Override
	public List<Drone> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}