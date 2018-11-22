package com.esdrasmorais.drones.domain.model;

import com.esdrasmorais.ddd.repository.IdentifiedDomainObject;
import com.esdrasmorais.drones.domain.model.interfaces.IDrone;

//import org.springframework.data.annotation.Id;

public abstract class Product extends IdentifiedDomainObject 
	implements IDrone
{
	protected String product;
	protected String version;
	protected String firmware;
	protected Battery battery;
	protected Boolean isAvailable;
	
	public void setProduct(Long id) {
		this.product = product;
	}
	
	public String getProduct() {
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
	
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public String getVersion() {
		return version;
	}

	public String getFirmware() {
		return firmware;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}
}
