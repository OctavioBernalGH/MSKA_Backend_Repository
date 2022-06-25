package com.http.mska;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class MskaAppBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MskaAppBackendApplication.class, args);
	}

}
