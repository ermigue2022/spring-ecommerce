package com.curso.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) esto era para que no tuviera en cuenta BD al principio
@SpringBootApplication
public class SpringEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEcommerceApplication.class, args);
	}

}
