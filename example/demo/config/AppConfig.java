package com.example.demo.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.daoImpl.ProcessDaoImpl;
import com.example.demo.daoImpl.StudentImpl;
import com.example.demo.daoImpl.UserImpl;

@Configuration
@ComponentScan("com.example.demo.daoImpl")
public class AppConfig {
	
	
//	@Bean
//	public StudentImpl getStudent1() {
//		return new  StudentImpl();
//	}
////	
//	@Bean
//	public UserImpl getUser() {
//		return new UserImpl();
//	}
}
