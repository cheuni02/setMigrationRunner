package com.setupMigrationRunner.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SetMigrationRunner implements CommandLineRunner {

	@Autowired NonWebService service;

	public static void main(String[] args) {
		System.out.println("Welcome to the command argument printer ...");
		SpringApplication.run(SetMigrationRunner.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.printMessage(args);
	}
}
