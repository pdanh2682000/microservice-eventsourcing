package com.ltfullstack.discoverserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@EnableEurekaServer
@SpringBootApplication
public class DiscoverserverApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DiscoverserverApplication.class);

	public static void main(String[] args) {
		logger.info("-------------------------- DA TEST CI/CD aaa -----------------------");
		SpringApplication.run(DiscoverserverApplication.class, args);
	}

}
