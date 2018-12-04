package com.esdrasmorais.drones.application;

import java.util.List;

import com.esdrasmorais.ddd.application.Application;
import com.esdrasmorais.ddd.service.IService;
import com.esdrasmorais.drones.application.interfaces.IRouteApplication;
import com.esdrasmorais.drones.domain.model.Route;

public class RouteApplication extends Application<Route>
	implements IRouteApplication
{
	private final IService<Route> routeService;
	
	public RouteApplication(IService<Route> routeService) {
		super(routeService);
		this.routeService = routeService;
	}

	public List<Route> findAll() {
		return this.routeService.findAll();
	}
	
	public Boolean save(Route route) {
		return this.routeService.save(route);
	}
}
