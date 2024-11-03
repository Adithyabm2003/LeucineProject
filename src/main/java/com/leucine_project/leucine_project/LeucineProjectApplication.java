package com.leucine_project.leucine_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class LeucineProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeucineProjectApplication.class, args);
	}

}
