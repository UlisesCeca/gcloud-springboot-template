package com.template.gcloudspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin("*")
public class GcloudspringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(GcloudspringbootApplication.class, args);
	}

	@GetMapping("/")
	@CrossOrigin("*")
	public String hello() {
		return "Hello Spring boot!";
	}
}