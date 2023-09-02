package com.dhirajapp.nameingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class NameingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NameingServerApplication.class, args);
	}

}
