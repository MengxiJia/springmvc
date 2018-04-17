package com.chen.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chen.dao.impl.UserDaoImpl;
import com.chen.dao.main.User;

@Controller
public class UserController {
	@RequestMapping(value="Registered")
	public String getRegistered() {
		return "web/registered";
	}
	@RequestMapping(value="RegisterController")
	public String RegisterController(User user,HttpServletRequest request) {
		UserDaoImpl dao = new UserDaoImpl();
		boolean success = dao.Registered(user);
		if(success) {
			request.setAttribute("rems", "×¢²á³É¹¦");
		} else {
			request.setAttribute("rems", "×¢²áÊ§°Ü");
		}
		return "web/registered";		
	}
	
}
