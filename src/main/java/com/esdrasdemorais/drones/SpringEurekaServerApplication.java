package com.esdrasdemorais.drones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.esdrasdemorais.drones.application.DroneApplication;
import com.esdrasdemorais.drones.application.RouteApplication;
import com.esdrasdemorais.drones.application.interfaces.IDroneApplication;
import com.esdrasdemorais.drones.application.interfaces.IRouteApplication;

        

@SpringBootApplication
@ComponentScan(basePackages = "com.esdrasdemorais.drones")
public class SpringEurekaServerApplication {
	public SpringEurekaServerApplication() {
                MutablePicoContainer pico = new DefaultPicoContainer();
                pico.addComponent(IDroneApplication.class, DroneApplication.class);
                pico.addComponent(IRouteApplication.class, RouteApplication.class);
                pico.start();
        }
/*
        public static void main(String[] args) {
                SpringApplication.run(SpringEurekaServerApplication.class, args);
//              new SpringApplicationBuilder(
//                      SpringEurekaServerApplication.class
//              ).web(true).run(args);
        }
*/
    public static void main(String[] args) {
       	//SpringApplication.run(DronesApplication.class, args);
	ConfigurableApplicationContext context = SpringApplication.run(SpringEurekaServerApplication.class, args);

        // Debug - print all beans
        String[] beanNames = context.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.println(name);
        }
    }
}


