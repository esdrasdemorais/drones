package com.esdrasdemorais.drones.domain.model.interfaces;

import com.esdrasdemorais.drones.domain.model.CameraMode;

public interface ISchedule {
	public void setWeather(IWeather weather);
	public void setCameraMode(CameraMode cameraMode);
	public void isLikelyFlight(Boolean isLikelyFlight);
	public void setAverageSpeedyInMeterPerSecond(
		Double averageSpeedyInMeterPerSecond
	);
	public void setAverageHeightInMeter(Double averageHeightInMeter);
}
