package com.java.phone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.phone.service.NguoiDungService;

@Controller

public class index_view {
	
	
	
	@RequestMapping(value={"/","/index"})
	public String Default(@RequestParam(value = "error", required = false) final String error, final Model model) {
	    if (error != null) {
	        model.addAttribute("message", "Login Failed!");
	      }
		return "index";
	}
	@RequestMapping("/user")
	public String user() {
		return "index";
	}
	
	@RequestMapping("/logout")
	  public String logout(final Model model) {
	    model.addAttribute("message", "Logged out!");
	    return "index";
	  }
}
