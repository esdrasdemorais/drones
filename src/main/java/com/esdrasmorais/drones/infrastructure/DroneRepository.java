package com.esdrasmorais.drones.infrastructure;

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
}

