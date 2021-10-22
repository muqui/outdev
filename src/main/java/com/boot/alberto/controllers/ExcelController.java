package com.boot.alberto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.boot.alberto.services.Excel;

@Controller
public class ExcelController {
	@Autowired
	Excel excel;
	@GetMapping(path ="/excel")
	 public ModelAndView post()	{
	 ModelAndView modelAndView = new ModelAndView("excel");
	 excel.createdFile();
	 modelAndView.addObject("result",  excel.createdFile());
	 return modelAndView;
	 }

}
