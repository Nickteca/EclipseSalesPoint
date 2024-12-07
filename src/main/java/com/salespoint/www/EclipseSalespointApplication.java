package com.salespoint.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class EclipseSalespointApplication {

	public static void main(String[] args) {
		SpringApplication.run(EclipseSalespointApplication.class, args);
	}

}
