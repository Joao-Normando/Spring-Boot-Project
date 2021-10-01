package com.joaonormando.hrgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HrgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrgatewayApplication.class, args);
	}

}
