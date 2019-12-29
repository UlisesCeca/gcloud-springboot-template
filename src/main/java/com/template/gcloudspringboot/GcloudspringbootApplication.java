package com.template.gcloudspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "https://front-dot-dedede-263318.appspot.com", maxAge = 3600)
public class GcloudspringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(GcloudspringbootApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello Spring boot!";
	}
}