package com.hm.airlines.airlinesinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AirlinesInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlinesInfoServiceApplication.class, args);
	}

}
