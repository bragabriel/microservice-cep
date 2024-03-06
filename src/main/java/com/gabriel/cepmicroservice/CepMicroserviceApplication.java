package com.gabriel.cepmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CepMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CepMicroserviceApplication.class, args);
	}

}
