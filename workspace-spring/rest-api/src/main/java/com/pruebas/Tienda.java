package com.pruebas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication

public class Tienda {

	public static void main(String[] args) {

		SpringApplication.run(Tienda.class, args);

	}

}