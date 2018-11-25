package com.esdrasmorais.drones.domain.model.interfaces;

import java.util.Date;
import java.util.List;

import com.esdrasmorais.drones.domain.model.Frequency;
import com.esdrasmorais.drones.domain.model.RouteType;

public interface IRoute {
	public void setStartTime(Date startTime);
	public void setDurationInMinutes(Integer durationInMinutes);
	public void setDistanceInMeter(Double distanceInMeter);
	public void setFrequency(Frequency scheduleFrequency);
	public void setStroke(List<IStroke> stroke);
	public Boolean isSaved(IRoute route);
	public void setDrone(List<IDrone> drone);
	public void setOperator(List<IEmployee> employee);
	public void setRouteType(RouteType type);
}