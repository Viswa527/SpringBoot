package com.packageApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleRest {
	@RequestMapping("/")
	public String welcome() {
		return "Hai welcome";
	}

}
