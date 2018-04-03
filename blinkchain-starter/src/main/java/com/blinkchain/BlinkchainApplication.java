package com.blinkchain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BlinkchainApplication {

	@RequestMapping("/")
	public String index(){
		return "Hello Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(BlinkchainApplication.class, args);
	}
}
