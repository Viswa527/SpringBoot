package com.packageApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.packageController")
public class Sample {

	public static void main(String[] args) {
		SpringApplication.run(Sample.class, args);
	}

}
