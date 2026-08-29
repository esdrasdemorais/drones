package com.esdrasdemorais.drones.domain.service.interfaces;

import java.util.List;

import com.esdrasmorais.ddd.service.IService;
import com.esdrasdemorais.drones.domain.model.Drone;

@org.springframework.stereotype.Service
public interface IDroneService extends IService<Drone> {
	public List<Drone> findByName(String name);
}
