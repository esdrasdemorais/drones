package com.esdrasmorais.drones.domain.service;

import java.util.List;

import com.amazonaws.services.ec2.model.Route;
import com.esdrasmorais.ddd.repository.interfaces.IRepository;
import com.esdrasmorais.ddd.service.Service;
import com.esdrasmorais.drones.domain.model.Drone;
import com.esdrasmorais.drones.domain.service.interfaces.IRouteService;

public class RouteService extends Service<Route>
	implements IRouteService
{
	private final IRepository<Route> routeRepository;
	
	public RouteService(IRepository<Route> routeRepository) {
		super(routeRepository);
		this.routeRepository = routeRepository;
	}
	
	public List<Route> findAll() {
		return this.routeRepository.findAll();
	}
	
	public List<Route> findByDrone(Drone drone) {
		Object[] object = new Object[] { drone };
		return this.routeRepository.find("drone", object);
	}
	
	public Boolean save(Route route) {
		return this.routeRepository.save(route);
	}
}
