package com.example.demoNetflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoNetflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoNetflixApplication.class, args);
	}

}
