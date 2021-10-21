package com.boot.alberto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExcelController {
	@GetMapping(path ="/excel")
	 public ModelAndView post()	{
	 ModelAndView modelAndView = new ModelAndView("excel");
	// modelAndView.addObject("posts", this.getPost());
	 return modelAndView;
	 }

}
