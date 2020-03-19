package com.cg.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hello")
public class HelloController {

	@RequestMapping("/index.obj")
	public String homePage()
	{
		return "index";
	}
	
	@RequestMapping("hello.obj")
	public String sayHello()
	{
		
		  return "welcome";
	}
	
	@RequestMapping(value="bvrit.obj",method=RequestMethod.POST)
	public ModelAndView  helloBvrit()
	{
		String  str=" Welcome To BVRIT Campus ";
		String  city="Hyderabad";
		ModelAndView model = new ModelAndView("show","message",str);
		
		model.addObject("city", city);
		return model ;
		
	}
	
	
}
