package com.turing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.turing.entity.Emp;
import com.turing.service.IEmpService;

@Controller
public class EmpController {
	
	//依赖业务层对象，注入该对象
	@Autowired
	private IEmpService empService;

	@RequestMapping("/show")
	public String show(Model model) {
		List<Emp> list = empService.findAll();
		model.addAttribute("list", list);
		return "show";
	}
	
	@RequestMapping(value = "/login2",method = RequestMethod.POST)
	public ModelAndView add(Emp emp) {
		int result = empService.add(emp);
		System.out.println(result);
		return null;
	}
}
