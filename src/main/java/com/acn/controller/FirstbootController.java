package com.acn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@Service
public class FirstbootController {
	@GetMapping("/")
	public String home() {
		
		return "mysite";  //html logical site name!
	}
	
	@GetMapping("/jump")
	
	public String jump() {
		
		return "jump";  //html logical site name!
	}
	
	

}
