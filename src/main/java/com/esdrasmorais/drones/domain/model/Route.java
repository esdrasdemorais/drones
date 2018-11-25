package com.esdrasmorais.drones.domain.model;

import java.util.Date;
import java.util.List;

import com.esdrasmorais.drones.domain.model.interfaces.IDrone;
import com.esdrasmorais.drones.domain.model.interfaces.IEmployee;
import com.esdrasmorais.drones.domain.model.interfaces.IRoute;
import com.esdrasmorais.drones.domain.model.interfaces.IStroke;

public class Route implements IRoute {
	protected Date startTime;
	protected Integer durationInMinutes;
	protected Double distanceInMeter;
	protected Frequency scheduleFrequency;
	protected List<IStroke> stroke;
	protected List<IDrone> drone;
	protected List<IEmployee> employee;
	protected RouteType type;
	
	@Override
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Override
	public void setDurationInMinutes(Integer durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	@Override
	public void setDistanceInMeter(Double distanceInMeter) {
		this.distanceInMeter = distanceInMeter;
	}

	@Override
	public void setFrequency(Frequency scheduleFrequency) {
		this.scheduleFrequency = scheduleFrequency;
	}

	@Override
	public void setStroke(List<IStroke> stroke) {
		this.stroke = stroke;
	}

	@Override
	public Boolean isSaved(IRoute route) {
		return route != null;
	}

	@Override
	public void setDrone(List<IDrone> drone) {
		this.drone = drone;
	}

	@Override
	public void setOperator(List<IEmployee> employee) {
		this.employee = employee;
	}

	@Override
	public void setRouteType(RouteType type) {
		this.type = type;
	}

	public Frequency getScheduleFrequency() {
		return scheduleFrequency;
	}

	public void setScheduleFrequency(Frequency scheduleFrequency) {
		this.scheduleFrequency = scheduleFrequency;
	}

	public List<IEmployee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<IEmployee> employee) {
		this.employee = employee;
	}

	public RouteType getType() {
		return type;
	}

	public void setType(RouteType type) {
		this.type = type;
	}

	public Date getStartTime() {
		return startTime;
	}

	public Integer getDurationInMinutes() {
		return durationInMinutes;
	}

	public Double getDistanceInMeter() {
		return distanceInMeter;
	}

	public List<IStroke> getStroke() {
		return stroke;
	}

	public List<IDrone> getDrone() {
		return drone;
	}	
}