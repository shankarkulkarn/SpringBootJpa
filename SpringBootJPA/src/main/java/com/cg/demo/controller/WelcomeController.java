package com.cg.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("welcome")
public class WelcomeController {

	@RequestMapping("hello.obj")
	public String sayHello()
	{
		
		  return "welcome";
	}
}
