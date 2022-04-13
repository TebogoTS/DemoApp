package com.example.demo;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@SpringBootApplication
@RestController
@XRayEnabled
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public String landingPage() {
		return "This is the landing page of the Java and SpringBoot Application by Tebogo";
	}

	@GetMapping("/hello")
	public String hello() {
		return "********** Hello World from Java and SpringBoot by Tebogo **********";
	}

	@GetMapping("/another")
	public String another() {
		return "########## This is another path of the Java and SpringBoot by Tebogo ##########";
	}

}
