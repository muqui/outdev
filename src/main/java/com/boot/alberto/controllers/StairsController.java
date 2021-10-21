package com.boot.alberto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.boot.alberto.services.Factorial;



@Controller
public class StairsController {
	@Autowired
	Factorial factorial;
	@GetMapping(path ="/stairs")
	 public ModelAndView post()	{
	 ModelAndView modelAndView = new ModelAndView("stairs");
	 modelAndView.addObject("result", factorial.calculo());
	 return modelAndView;
	 }
}
