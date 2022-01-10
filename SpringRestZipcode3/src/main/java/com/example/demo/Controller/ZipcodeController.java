package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ZipcodeRepo;
import com.example.demo.model.Zipcode;

@Controller
public class ZipcodeController 
{
	@Autowired
	ZipcodeRepo  repo;
	
	@RequestMapping("/")
	public String home() 
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addZipcode")
	public String addZipcode(Zipcode zipcode) 
	{
		repo.save(zipcode);
		return "home.jsp";
	}
	
	@RequestMapping("/getZipcode")
	public ModelAndView getZipcode(@RequestParam int zcode) 
	{
		ModelAndView mv=new ModelAndView("show.jsp");
		
		Zipcode zipcode=repo.findById(zcode).orElse(new Zipcode());
		mv.addObject(zipcode);
		return mv;
	}
}
