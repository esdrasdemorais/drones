package com.esdrasmorais.drones.domain.model.interfaces;

import com.esdrasmorais.drones.domain.model.Battery;

public interface IDrone {
	public void setProduct(String product);
	public void setVersion(String version);
	public void setFirmware(String firmware);
	public void setBattery(Battery battery);
	public void setIsAvailable(Boolean isAvailable);
}
