package com.esdrasmorais.drones.domain.model;

import java.time.Clock;

import com.esdrasmorais.ddd.repository.IdentifiedDomainObject;
import com.esdrasmorais.drones.domain.model.interfaces.IWeather;

public abstract class Weather extends IdentifiedDomainObject
	implements IWeather
{
	protected Double minTemperatureInCelsius;
	protected Double maxTemperatureInCelsius;
	protected Double averageTemperatureInCelsius;
	protected Double precipitationInMiliter;
	protected Double pressureInHpa;
	protected Double windSpeedInMeterPerSecond;
	protected Double cloudsInPercent;
	protected Double humidityInPercent;
	protected Clock sunriseAt;
	protected Clock sunsetAt;
	
	@Override
	public void setMinTemperature(Double minTemperatureInCelsius) {
		this.minTemperatureInCelsius = minTemperatureInCelsius;
	}

	@Override
	public void setMaxTemperature(Double maxTemperatureInCelsius) {
		this.maxTemperatureInCelsius = maxTemperatureInCelsius;
	}

	@Override
	public void setAverageTemperatureInCelsius(Double averageTemperatureInCelsius) {
		this.averageTemperatureInCelsius = averageTemperatureInCelsius;
	}

	@Override
	public void setPrecipitationInMilimeter(Double precipitationInMiliter) {
		this.precipitationInMiliter = precipitationInMiliter;
	}

	@Override
	public void setPressureInHpa(Double pressureInHpa) {
		this.pressureInHpa = pressureInHpa;
	}

	@Override
	public void setWindSpeedInMeterPerSecond(Double windSpeedInMeterPerSecond) {
		this.windSpeedInMeterPerSecond = windSpeedInMeterPerSecond;
	}

	@Override
	public void setCloudsInPercent(Double cloudsInPercent) {
		this.cloudsInPercent = cloudsInPercent;
	}

	@Override
	public void setHumidityInPercent(Double humidityInPercent) {
		this.humidityInPercent = humidityInPercent;
	}

	@Override
	public void setSunriseAt(Clock sunriseAt) {
		this.sunriseAt = sunriseAt;
	}

	@Override
	public void setSunsetAt(Clock sunsetAt) {
		this.sunriseAt = sunsetAt;
	}
}