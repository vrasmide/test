package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginControllerExm {
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String LoginPage() {
	return "login";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String WelcomePage(ModelMap model, @RequestParam String userId, @RequestParam String password) {
	if(userId.equals("rashmi")&&(password.equals("123")))
	{
	return "welcome";
	}
	model.put("errorMsg", "please provide correct username and password");
	return "login";
	}
	}




