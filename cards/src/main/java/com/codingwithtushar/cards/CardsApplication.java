package com.codingwithtushar.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardsApplication {

	public static void main(String[] args) {

		SpringApplication.run(CardsApplication.class, args);
		System.out.println("Cards Application is running at $server.port");
	}

}
