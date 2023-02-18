package com.mypfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CheckProcessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckProcessingApplication.class, args);
	}

}
