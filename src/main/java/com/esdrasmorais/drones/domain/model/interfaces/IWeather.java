package com.esdrasmorais.drones.domain.model.interfaces;

import java.time.Clock;

public interface IWeather {
	public void setMinTemperature(Double minTemperatureInCelsius);
	public void setMaxTemperature(Double maxTemperatureInCelsius);
	public void setAverageTemperatureInCelsius(Double averageTemperatureInCelsius);
	public void setPrecipitationInMilimeter(Double precipitationInMiliter);
	public void setPressureInHpa(Double pressureInHpa);
	public void setWindSpeedInMeterPerSecond(Double windSpeedInMeterPerSecond);
	public void setCloudsInPercent(Double cloudsInPercent);
	public void setHumidityInPercent(Double humidityInPercent);
	public void setSunriseAt(Clock sunriseAt);
	public void setSunsetAt(Clock sunsetAt);
}
