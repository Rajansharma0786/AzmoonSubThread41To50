package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AzmoonSubThread41To50Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(AzmoonSubThread41To50Application.class, args);
	}

}
