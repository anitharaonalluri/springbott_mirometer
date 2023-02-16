package com.practice.sb.micromerterApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootMicrometerApplication {

	@GetMapping("/message")
	public String getMessage() {
		return"Hello its working....";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicrometerApplication.class, args);
	}

}



