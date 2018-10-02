package com.esdrasmorais.drones.domain.model;

import org.springframework.data.annotation.Id;

import com.esdrasmorais.drones.domain.model.interfaces.IDrone;

public class Drone extends Product implements IDrone {

	@Id
	private Long id;
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public void setProduct(String product) {
		this.product = product;
	}
	
	@Override
	public void setVersion(String version) {
		this.version = version;
	}
	
	@Override
	public void setFirmware(String firmware) {
		this.firmware = firmware;
	}
}
