package com.esdrasmorais.drones.domain.model.interfaces;

import com.esdrasmorais.drones.domain.model.StrokeMode;
import com.google.gson.Gson;

public interface IStroke {
	public Boolean isScheduled(Boolean isSchedule);
	public void setCoordinates(Gson coordinates);
	public void setStrokeType(StrokeMode strokeType);
}
