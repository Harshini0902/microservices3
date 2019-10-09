package com.example.TechnologiesMicroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TechnologiesMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnologiesMicroServiceApplication.class, args);
	}

}
