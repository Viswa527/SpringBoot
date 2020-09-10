package com.packageController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRests {
	
	@RequestMapping("/hello")
	public String myData() {
		return "Hello";
	}

}
