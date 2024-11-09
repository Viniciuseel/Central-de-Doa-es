package com.doacoes.central;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CentralDeDoacoesApplication {

	private static final Logger logger = LoggerFactory.getLogger(CentralDeDoacoesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CentralDeDoacoesApplication.class, args);
		System.out.println("Api iniciada.");
	}

}
