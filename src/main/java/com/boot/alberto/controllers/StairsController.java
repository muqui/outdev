package com.boot.alberto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StairsController {
	@GetMapping(path ="/stairs")
	 public ModelAndView post()	{
	 ModelAndView modelAndView = new ModelAndView("stairs");
	// modelAndView.addObject("posts", this.getPost());
	 return modelAndView;
	 }
}
