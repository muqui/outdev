package com.boot.alberto.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {

	 @GetMapping(path ={"/signup","/"})
	 public ModelAndView post()	{
	 ModelAndView modelAndView = new ModelAndView("signup");
	// modelAndView.addObject("posts", this.getPost());
	 return modelAndView;
	 }
}
