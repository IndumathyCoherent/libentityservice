package com.spring.libentityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LibEntityApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibEntityApplication.class, args);
	}

}
