package com.hm.airlines.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AirlinesApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlinesApiGatewayApplication.class, args);
	}

}
