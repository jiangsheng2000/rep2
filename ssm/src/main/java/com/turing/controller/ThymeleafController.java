package com.turing.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("msg", "你好，Thymeleaf！");
		return "hello";
	}
	
	//放域对象
	@RequestMapping("/inner")
	public String inner(HttpServletRequest request) {
		//请求域
		request.setAttribute("requestMsg", "请求域-张三");
		//回话域
		request.getSession().setAttribute("sessionMsg", "回话域-张三");
		//全局域
		request.getServletContext().setAttribute("applicationMsg", "全局域-张三");
		return "hello";
	}	
}
