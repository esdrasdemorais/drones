package com.esdrasmorais.drones.domain.service.interfaces;

import java.util.List;

import com.esdrasmorais.ddd.service.IService;
import com.esdrasmorais.drones.domain.model.Drone;

public interface IDroneService extends IService<Drone> {
	public List<Drone> findByName(String name);
}