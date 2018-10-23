package com.esdrasmorais.drones.domain.model;

import org.springframework.data.annotation.Id;

public abstract class Product implements IDrone {
	protected String product;
	protected String version;
	protected String firmware;
	protected BatteryDuration batteryDuration;
	
	@Id
	private Long id;
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return this.product;
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
