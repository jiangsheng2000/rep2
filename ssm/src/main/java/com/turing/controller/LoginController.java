package com.turing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView login(String username) {
		System.out.println("ÓÃ»§Ãû£º"+username);
		return null;
	}
}
