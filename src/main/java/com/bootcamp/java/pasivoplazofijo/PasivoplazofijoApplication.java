package com.bootcamp.java.pasivoplazofijo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class PasivoplazofijoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasivoplazofijoApplication.class, args);
	}

}
