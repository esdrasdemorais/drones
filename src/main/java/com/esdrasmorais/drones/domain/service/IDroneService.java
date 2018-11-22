package com.esdrasmorais.drones.domain.service;

import java.util.List;

import com.esdrasmorais.ddd.service.IService;
import com.esdrasmorais.drones.domain.model.Drone;

public interface IDroneService extends IService<Drone> {
	public List<Drone> findByName(String name);
}