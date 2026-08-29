package com.esdrasdemorais.drones.application;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import jakarta.jms.*;

@SpringBootApplication
@ComponentScan(basePackages = {"com.esdrasdemorais.drones", "com.esdrasdemorais.drones.jms"})
@EnableScheduling
@EnableJms
public class JmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsApplication.class, args);
	}

	static final String Q = "messages";
}
