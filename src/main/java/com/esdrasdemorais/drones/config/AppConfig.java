package com.esdrasdemorais.drones.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.esdrasdemorais.drones.domain.service.interfaces.IDroneService;
import com.esdrasdemorais.drones.domain.service.DroneService;
import com.esdrasdemorais.drones.domain.service.interfaces.IRouteService;
import com.esdrasdemorais.drones.domain.service.RouteService;

import com.esdrasmorais.ddd.repository.interfaces.IContext;
import com.esdrasmorais.ddd.repository.interfaces.IClient;
import com.esdrasmorais.ddd.repository.interfaces.IDb;
import com.esdrasmorais.ddd.repository.*;

import com.esdrasdemorais.drones.infrastructure.DroneRepository;
import com.esdrasdemorais.drones.infrastructure.RouteRepository;

import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.Exception;
import java.lang.String;

import com.esdrasmorais.ddd.repository.MongoClientImpl;

import com.esdrasdemorais.drones.infrastructure.interfaces.IDroneRepository;

@Configuration
public class AppConfig {
 
    private static final Logger logger = LoggerFactory.getLogger(AppConfig.class);
     
    private IClient _client;
  
    public AppConfig(@Lazy IClient client) throws Exception {
	try {
	    if (client == null) _client = new MongoClientImpl(System.getProperty("mongo_uri") == null ? "test" : System.getProperty("mongo_uri"));
	    else _client = client;
	} catch (Exception ex) {
	    logger.error(ex.getMessage() + " - Error!");
	}
    }

    @Bean
    public IClient client() {
	return _client;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IContext context() {
	return new MongoContext();
    }

    @Bean
    public IClient primaryClient() throws Exception {
	return _client;
    }

    @Bean
    public IDb db() throws Exception {
	IDb db = null;
	try {
	    db = primaryClient().getDb("Drones");
	} catch (Exception ex) {
	    logger.error("Erro! " + ex.getMessage());
	}
	return db;
    }

/*    @Bean
    public IDroneRepository droneRepository() throws Exception {
	return new DroneRepository(context(), _client, db());
    }

    @Bean
    @Lazy
    public IDroneService droneService() throws Exception {
	logger.info("Drones db is alive!");
	return new DroneService(droneRepository());
    }
*/
    /*@Bean
    public IRouteService routeService() throws Exception {
        IClient client = primaryClient();
	if (client == null) client = context().getClient();
        IDb db = client.getDb("Router");
	logger.info("Router db is alive!");
	return new RouteService(new RouteRepository(context(), client, db));
    }*/

}
