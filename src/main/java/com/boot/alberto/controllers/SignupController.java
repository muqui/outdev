package com.boot.alberto.controllers;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.boot.alberto.model.Person;

@Controller
public class SignupController {

	 @GetMapping(path ={"/signup","/"})
	 public String post(Model model)	{
	 //ModelAndView modelAndView = new ModelAndView("signup");
	 Person person = new Person();
	 model.addAttribute("person", person);
	 //modelAndView.addAttribute("user", person);
	// modelAndView.addObject("posts", this.getPost());
	 return "signup";
	 }
	 
	 @PostMapping("/register")
	 public String submitForm(@ModelAttribute("person") Person person) {
	     System.out.println(person);
	     return "register_success";
	 }
}
