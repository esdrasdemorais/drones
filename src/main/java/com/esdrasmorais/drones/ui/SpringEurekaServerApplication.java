package com.esdrasmorais.drones.ui;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

import com.esdrasmorais.drones.application.DroneApplication;
import com.esdrasmorais.drones.application.RouteApplication;
import com.esdrasmorais.drones.application.interfaces.IDroneApplication;
import com.esdrasmorais.drones.application.interfaces.IRouteApplication;

@SpringBootApplication
@ComponentScan(basePackages = "com.esdrasmorais.drones.application")
@EnableEurekaServer	// Enable eureka server
public class SpringEurekaServerApplication {
	public SpringEurekaServerApplication() {
		MutablePicoContainer pico = new DefaultPicoContainer();
		pico.addComponent(IDroneApplication.class, DroneApplication.class);
		pico.addComponent(IRouteApplication.class, RouteApplication.class);
		pico.start();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServerApplication.class, args);
//		new SpringApplicationBuilder(
//			SpringEurekaServerApplication.class
//		).web(true).run(args);
	}
}