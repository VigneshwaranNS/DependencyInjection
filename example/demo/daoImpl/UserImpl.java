package com.example.demo.daoImpl;

import org.springframework.stereotype.Component;

import com.example.demo.dao.EmployeeDao;

@Component
public class UserImpl implements EmployeeDao{

	@Override
	public String getData() {
	
		System.err.println("User Data");
		
		return "User Data";
	}

}
