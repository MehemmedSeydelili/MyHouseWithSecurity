package com.example.MyHouseWithSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class MyHouseWithSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHouseWithSecurityApplication.class, args);
	}

}
