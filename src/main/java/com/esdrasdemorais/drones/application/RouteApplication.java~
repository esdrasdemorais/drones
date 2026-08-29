package com.esdrasdemorais.drones.application;

import java.util.List;

import com.esdrasmorais.ddd.application.Application;
import com.esdrasmorais.ddd.service.IService;
import com.esdrasdemorais.drones.application.interfaces.IRouteApplication;
import com.esdrasdemorais.drones.domain.model.Route;
import com.esdrasdemorais.drones.domain.service.interfaces.IRouteService;

import org.springframework.stereotype.Component;

@Component
public class RouteApplication extends Application<Route>
	implements IRouteApplication
{
	private final IRouteService routeService;
	
	public RouteApplication(IRouteService routeService) {
		super((IService<Route>)routeService);
		this.routeService = routeService;
	}

	public List<Route> findAll() {
		return (List<Route>) this.routeService.findAll();
	}
	
	public Boolean save(Route route) {
		return this.routeService.save(route);
	}
}
