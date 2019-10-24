package com.turing.service;

import java.util.List;

import com.turing.entity.Emp;

public interface IEmpService {

	List<Emp> findAll();
	
	int add(Emp emp);
}
