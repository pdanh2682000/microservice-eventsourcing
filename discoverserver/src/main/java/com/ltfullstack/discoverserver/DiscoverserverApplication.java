package com.ltfullstack.discoverserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoverserverApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DiscoverserverApplication.class);

	public static void main(String[] args) {
		logger.info("-------------------------- DA TEST CI/CD -----------------------");
		SpringApplication.run(DiscoverserverApplication.class, args);
	}

}
