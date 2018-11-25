package com.esdrasmorais.drones.domain.model;

import com.esdrasmorais.drones.domain.model.interfaces.ISchedule;
import com.esdrasmorais.drones.domain.model.interfaces.IWeather;

public abstract class Schedule implements ISchedule {
	protected IWeather weather;
	protected CameraMode cameraMode = CameraMode.DOWN;
	protected Boolean isLikelyFlight;
	protected Double averageSpeedyInMeterPerSecond = 15.0;
	protected Double averageHeightInMeter = 100.0;
	
	@Override
	public void setWeather(IWeather weather) {
		this.weather = weather;
	}

	@Override
	public void setCameraMode(CameraMode cameraMode) {
		this.cameraMode = cameraMode;
	}

	@Override
	public void isLikelyFlight(Boolean isLikelyFlight) {
		this.isLikelyFlight = isLikelyFlight;
	}

	@Override
	public void setAverageSpeedyInMeterPerSecond(
		Double averageSpeedyInMeterPerSecond
	) {
		this.averageSpeedyInMeterPerSecond = averageSpeedyInMeterPerSecond; 
	}

	@Override
	public void setAverageHeightInMeter(Double averageHeightInMeter) {
		this.averageHeightInMeter = averageHeightInMeter;
	}

	public Boolean getIsLikelyFlight() {
		return isLikelyFlight;
	}

	public void setIsLikelyFlight(Boolean isLikelyFlight) {
		this.isLikelyFlight = isLikelyFlight;
	}

	public IWeather getWeather() {
		return weather;
	}

	public CameraMode getCameraMode() {
		return cameraMode;
	}

	public Double getAverageSpeedyInMeterPerSecond() {
		return averageSpeedyInMeterPerSecond;
	}

	public Double getAverageHeightInMeter() {
		return averageHeightInMeter;
	}
}
