package com.matheus.catalogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.matheus.catalogo")
@Configuration
@SpringBootApplication
public class CatalogoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoApplication.class, args);
	}

}
