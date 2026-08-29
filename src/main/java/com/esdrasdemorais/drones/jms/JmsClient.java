package com.esdrasdemorais.drones.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import jakarta.jms.Message;
import jakarta.jms.Session;

@Component
public class JmsClient {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(String queueName, String message) {
        jmsTemplate.convertAndSend(queueName, message);
    }

    public String receiveMessage(String queueName) {
        return (String) jmsTemplate.receiveAndConvert(queueName);
    }
}
	
/*	
    @JmsListener(destination = Q)
    void onMessage (String message) {
	System.out.println("got a message [" + message + "]");
    }
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Your JMS consumer logic here
        System.out.println("JMS Consumer started...");
    }*/
//}
