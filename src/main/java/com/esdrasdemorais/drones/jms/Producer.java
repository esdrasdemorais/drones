package com.esdrasdemorais.drones.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import jakarta.jms.Session;

@Component
public class Producer {
    @Autowired
    private JmsClient jmsClient;
    private int counter = 0;
    
    @Scheduled(fixedDelay = 10000)
    public void sendMessage() {
        jmsClient.sendMessage("myQueue", "Message #" + (++counter));
    }
}
/*
@Component
class Producer implements ApplicationRunner {
	private final JmsClient jms;

	Producer (JmsClient jms) {
		this.jms = jms;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
	    //jms.destination(JmsApplication.Q).send("Hello JMS!");
	    //var next = jms.destination(JmsApplication.Q).receive();
	    //next.ifPresent(Message<?> message -> System.out.println(message.getPayload()));
	    jms.destination(Q)
		.send("see ya later");
	}
}
*/
