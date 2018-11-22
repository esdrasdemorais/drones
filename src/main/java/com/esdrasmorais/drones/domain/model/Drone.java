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
}
