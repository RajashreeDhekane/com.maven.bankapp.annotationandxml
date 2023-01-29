package com.maven.bankapp.annotationandxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApplication {

	public static void main(String[] args) {
		
		// xml based configuration and Annotation based config
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Employee emp = (Employee) context.getBean("manager");
		System.out.println(emp.work());

		
	}
		
}
