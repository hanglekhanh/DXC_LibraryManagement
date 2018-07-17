package com.library.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.library.dao.UserDAOImp;
import com.library.entity.User;
import com.library.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/addUser")
	public String addUser() {
		User u = new User();
		u.setUserName("admin");
		u.setPassWord("123");
		u.setIsAdmin(1);
		userService.addUser(u);
		return "Login";
	}
	
	@RequestMapping("/login")
	public String loginUser(@ModelAttribute("userForm") User user,HttpServletRequest request) {
		String name =  request.getParameter("name");
		String pass =  request.getParameter("pass");
		
		if(userService.checkloging(name, pass)) {
			return "sussces";
		}
		else {
			return "fail";
		}
		
	
//				List<User> listUser = new ArrayList<>();
//		listUser = getAllUser();
//		
//		for(User u:listUser) {
//			if(user.getUserName().equals(u.getUserName()) ) {
//				System.out.println("right");
//			}else {
//				System.out.println("wrong");
//			}
//		}
//		return "LoginSuccess";
	}
	
	private List<User> getAllUser(){
		return userService.getAllUser();
	}
}
