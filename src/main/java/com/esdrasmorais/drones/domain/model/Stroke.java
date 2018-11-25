package com.esdrasmorais.drones.domain.model;

import com.esdrasmorais.drones.domain.model.interfaces.IStroke;
import com.google.gson.Gson;

public abstract class Stroke implements IStroke {
	protected Boolean isSchedule;
	protected Gson coordinates;
	protected StrokeMode strokeType;
	
	@Override
	public Boolean isScheduled(Boolean isSchedule) {
		this.isSchedule = isSchedule;
		return this.isSchedule;
	}

	@Override
	public void setCoordinates(Gson coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public void setStrokeType(StrokeMode strokeType) {
		this.strokeType = strokeType;
	}

	public Boolean getIsSchedule() {
		return isSchedule;
	}

	public void setIsSchedule(Boolean isSchedule) {
		this.isSchedule = isSchedule;
	}

	public Gson getCoordinates() {
		return coordinates;
	}

	public StrokeMode getStrokeType() {
		return strokeType;
	}
}