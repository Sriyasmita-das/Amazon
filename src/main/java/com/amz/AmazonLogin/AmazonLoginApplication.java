package com.amz.AmazonLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.amz.controller","com.amz.service"})
@EnableJpaRepositories("com.amz.repository")
@EntityScan("com.amz.model")
public class AmazonLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonLoginApplication.class, args);
	}

}
