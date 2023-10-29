package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.config.AppConfig;
import com.example.demo.dao.EmployeeDao;
import com.example.demo.daoImpl.ProcessDaoImpl;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
		
			  ApplicationContext context1 = new AnnotationConfigApplicationContext("com.example.demo"); // Package name where your Spring components are defined
		        String[] beanNames = context1.getBeanDefinitionNames();

		        for (String beanName : beanNames) {
		            System.out.println(beanName);
		        }
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProcessDaoImpl prod = context.getBean(ProcessDaoImpl.class);
		
		System.err.println(prod.getProcess());
	}

}
