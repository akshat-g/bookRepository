package com.projects.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.projects.sample.persistence.model")
@EntityScan("com.projects.sample.persistence.model")
@SpringBootApplication
public class SpringBootLearnApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootLearnApplication.class, args);
	}
}
