package com.example.demo.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;

@Component
public class ProcessDaoImpl {

	EmployeeDao employeeDao;
	
	
	@Autowired
	public ProcessDaoImpl(@Qualifier ("getStudent") EmployeeDao employeeDao) {
		
		this.employeeDao=employeeDao;
	}
	
	
	public String getProcess() {
		
		return this.employeeDao.getData();
	}

}
