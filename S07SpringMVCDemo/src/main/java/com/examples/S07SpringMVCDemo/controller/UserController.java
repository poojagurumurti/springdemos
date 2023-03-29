package com.examples.S07SpringMVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S07SpringMVCDemo.model.User;

@Controller
public class UserController {
	
	@RequestMapping("/register")
//	public ModelAndView showRegistrationPage() {
		public String showRegistrationPage() {
//		ModelAndView mv= new ModelAndView();
//		mv.setViewName("registeruser");
		return "registeruser";
		
	}
	
	@RequestMapping(value="/signupuser",method=RequestMethod.POST)
//	public ModelAndView SignUpUser(@ModelAttribute("user")User user) {
	public String SignUpUser(@ModelAttribute("user")User user,ModelMap model) {
//		ModelAndView mv= new ModelAndView();
//		mv.setViewName("registeruser");
//		return mv;
		
		System.out.println("From UI. Retrieved object from spring container:"+user);
//		ModelAndView mv= new ModelAndView();
//		mv.addObject("user",user);
//		mv.setViewName("registeruserresult");
//		return mv;
		model.addAttribute("user",user);
		return "registeruserresult";
		
	}
}
