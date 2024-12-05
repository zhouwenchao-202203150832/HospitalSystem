package cn.edu.zjut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.zjut.pojo.User;
import cn.edu.zjut.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	@RequestMapping("/login")
	public String login(@ModelAttribute("user") User user, Model model) {
		if (userService.login(user)) 
			return "patientHome";
		 else
			return "login";
	}
}
