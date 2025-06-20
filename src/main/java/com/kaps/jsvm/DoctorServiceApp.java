package com.kaps.jsvm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.kaps.jsvm.repository")
@EntityScan(basePackages = "com.kaps.jsvm.model")
public class DoctorServiceApp {

	private static final Logger log = LoggerFactory.getLogger(DoctorServiceApp.class);

	public static void main(String[] args)
	{
		log.info("DoctorServiceApp Application Start");
		SpringApplication.run(DoctorServiceApp.class, args);
	}
}
