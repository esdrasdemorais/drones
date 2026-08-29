package com.esdrasdemorais.drones.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import jakarta.jms.Session;

@Component
public class Consumer implements ApplicationRunner {
    @Autowired
    private JmsClient jmsClient;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //System.out.println("JMS Consumer started. Queue type: " + Session.QUEUE);
    }
    
    @JmsListener(destination = "myQueue")
    public void receiveMessage(String message) {
        System.out.println("Received: " + message);
    }
}
/*
@SpringBootApplication
public class JmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsApplication.class, args);
	}

	static final String Q = "messages";
}
*/
