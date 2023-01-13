package com.hm.airlines.airlinesbooking;


import org.apache.http.entity.ContentType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class AirlinesBookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlinesBookingServiceApplication.class, args);
	}
	
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplateBean() {
		return new RestTemplate();
	}
//	
//	@Bean
//	public RequestInterceptor authInterceptor() {
//		return(
//				request->{
//					request.header("auth", "This is a Header...");
//					request.header("Accept", ContentType.APPLICATION_JSON.getMimeType());
//					log.info("Header Sent");
//					
//				}
//				
//				);
//				
//	}

}
