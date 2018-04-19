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
			request.setAttribute("rems", "注册成功");
		} else {
			request.setAttribute("rems", "注册失败");
		}
		return "web/registered";
		//因为在springmvc中 写的是web-inf，我们这里有新建一个web文件夹，所以这里要加上web/
	}
	
}
