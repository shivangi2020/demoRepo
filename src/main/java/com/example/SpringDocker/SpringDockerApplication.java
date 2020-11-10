package com.example.SpringDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerApplication {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}

}
