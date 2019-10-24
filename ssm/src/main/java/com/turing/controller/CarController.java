package com.turing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.turing.entity.Car;
import com.turing.service.ICarService;

/**
 * 控制器
 * @author fred
 *
 */
@Controller
public class CarController {
	
	//控制层依赖业务层，注入业务层对象
	@Autowired
	private ICarService carService;

	@RequestMapping("/test")
	@ResponseBody //在该注解方法中，如果返回的是对象，就会解析成JSON，如果返回的是String，那就返回String
	public String test() {
		return "ssm success";
	}
	
	//地址栏敲/car/1,返回JSON
	@RequestMapping("/car/{id}")
	@ResponseBody
	public Car getCar(@PathVariable("id")Integer id) {
		return carService.findById(id);
	}
}
