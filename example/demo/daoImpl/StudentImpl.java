package com.example.demo.daoImpl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;

@Component("getStudent")
public class StudentImpl implements EmployeeDao{

	@Override
	public String getData() {
		
		System.err.println("Student Data");
		
		return "Student Data";
	}

}
