package com.springproject.Springbootproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SpringbootprojectApplicationController {
	
	
				@RequestMapping("/hello")
				public String get() {
					return "Hello world";
					
					
				}
	

}
