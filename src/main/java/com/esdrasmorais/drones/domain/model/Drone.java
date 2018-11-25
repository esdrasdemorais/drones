package com.esdrasmorais.drones.domain.model;

import java.util.Date;
import java.util.List;

//import org.springframework.data.annotation.Id;

import com.esdrasmorais.drones.domain.model.interfaces.ISchedule;

public class Drone extends Product {
	protected Float averageSpeed;
	protected Float averageHeight;
	protected Float averageChargeMin;
	protected CameraMode defaultMode;
	protected List<ISchedule> schedules;
	protected Date lastSchedule;
	public Float getAverageSpeed() {
		return averageSpeed;
	}
	public void setAverageSpeed(Float averageSpeed) {
		this.averageSpeed = averageSpeed;
	}
	public Float getAverageHeight() {
		return averageHeight;
	}
	public void setAverageHeight(Float averageHeight) {
		this.averageHeight = averageHeight;
	}
	public Float getAverageChargeMin() {
		return averageChargeMin;
	}
	public void setAverageChargeMin(Float averageChargeMin) {
		this.averageChargeMin = averageChargeMin;
	}
	public CameraMode getDefaultMode() {
		return defaultMode;
	}
	public void setDefaultMode(CameraMode defaultMode) {
		this.defaultMode = defaultMode;
	}
	public List<ISchedule> getSchedules() {
		return schedules;
	}
	public void setSchedules(List<ISchedule> schedules) {
		this.schedules = schedules;
	}
	public Date getLastSchedule() {
		return lastSchedule;
	}
	public void setLastSchedule(Date lastSchedule) {
		this.lastSchedule = lastSchedule;
	}
}
