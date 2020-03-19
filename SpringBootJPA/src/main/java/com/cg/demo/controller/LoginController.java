package com.cg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.demo.entity.UserDetail;
import com.cg.demo.service.LoginService;

@Controller
public class LoginController {

	@Autowired
    private LoginService loginService ;
	
	@RequestMapping("showloginpage.obj")
	public String showLoginPage()
	{
		  return "login";
	}
	@RequestMapping("validatelogin.obj")
	public ModelAndView  validate(@RequestParam("userName")  String user,@RequestParam("userPass") String pass)
	{
		String message="";
		
		UserDetail  userDetail = new UserDetail();
		userDetail.setUserName(user);
		userDetail.setUserPass(pass);
		boolean  flag = loginService.validate(userDetail);
		if( flag )
		{
			message="Login Success";
		}
		else
		{
			message="Login Failed";
		}
		ModelAndView  mv = new ModelAndView("display","message",message);
		
		return mv;
	}
	
}
