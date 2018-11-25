package com.esdrasmorais.drones.domain.model;
import java.util.Date;

import com.esdrasmorais.drones.domain.model.interfaces.IEmployee;

public abstract class Employee implements IEmployee {
	protected String email;
	protected String name;
	protected Date birth;
	protected Boolean isOutSourced;
}
