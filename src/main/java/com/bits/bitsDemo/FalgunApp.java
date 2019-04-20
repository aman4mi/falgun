package com.bits.bitsDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bits.bitsDemo"})

public class FalgunApp {

	public static void main(String[] args) {
		SpringApplication.run(FalgunApp.class, args);
	}

}

