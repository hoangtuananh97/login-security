package com.java.phone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class index_admin {

	@GetMapping
	public String Default(){
		return "admin";
	}
}
