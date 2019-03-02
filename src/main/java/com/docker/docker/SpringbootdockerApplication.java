package com.docker.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringbootdockerApplication {
	@RequestMapping("/")
	public String doit() {
		return "hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdockerApplication.class, args);
	}

}
