package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private CalculateService calculateService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private int calculateSum(int a, int b) {
		calculateService.sum(a,b);
		return 0;
	}

}
