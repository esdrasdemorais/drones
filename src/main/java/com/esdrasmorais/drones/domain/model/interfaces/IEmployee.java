package com.esdrasmorais.drones.domain.model.interfaces;

import java.util.Date;

public interface IEmployee {
	public void setEmail(String email);
	public void setName(String name);
	public void setBirth(Date birth);
	public void setIsOutSourced(Boolean isOutSourced);
}
