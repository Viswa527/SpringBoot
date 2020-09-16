package com.packageApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages="com.packageController")
@RestController
public class Applications {
	
	@Value("${spring.application.name:Mahesh}")
	private String name;
	public static void main(String args[]) {
	SpringApplication.run(Applications.class, args);
	}
	@RequestMapping(value = "/")
	public String welcome() {
		return "Welcome to Spring-Boot";
	}
	@RequestMapping(value ="/v")
	public String name() {
		return name;
	}
	
}
