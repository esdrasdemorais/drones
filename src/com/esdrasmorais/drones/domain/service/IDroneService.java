package com.esdrasmorais.drones.domain.service;

import java.util.List;

public interface IDroneService extends IService<Drone> {
	public List<Drone> findByName(String name);
}