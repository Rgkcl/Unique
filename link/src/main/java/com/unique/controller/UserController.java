package com.unique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.unique.service.UserService;



@Controller
@RequestMapping("/user")
public class UserController {
	    @Autowired
		private UserService  userService;
	@RequestMapping("/selectAll")
	@ResponseBody
	public String selectAll() {
		//地方都是
		return userService.selectAll();
	}
}
