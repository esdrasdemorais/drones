package com.esdrasmorais.drones.infrastructure;

import com.amazonaws.services.ec2.model.Route;
import com.esdrasmorais.ddd.repository.MongoRepository;
import com.esdrasmorais.ddd.repository.interfaces.IClient;
import com.esdrasmorais.ddd.repository.interfaces.IContext;
import com.esdrasmorais.ddd.repository.interfaces.IDb;
import com.esdrasmorais.drones.infrastructure.interfaces.IRouteRepository;

public class RouteRepository extends MongoRepository<Route>
	implements IRouteRepository
{
	public RouteRepository(IContext context, IClient client, IDb db) {
		super(context, client, db);
	}
}