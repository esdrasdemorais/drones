package com.esdrasdemorais.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsApplication.class, args);
	}

	static final String Q = "messages";
}

@Component
class Consumer implements ApplicationRunner {
	@JmsListener(destination = Q)
	void onMessage (String message) {
		System.out.println("got a message [" + message + "]");
	}	
}

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
