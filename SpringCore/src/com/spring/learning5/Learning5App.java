package com.spring.learning5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Learning5App {

	public Learning5App() {
	}

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");
		Learning5Employee emp = (Learning5Employee) context
				.getBean("learning5employee");

		System.out.println(emp.getEmpInfo1().getEmpId());
		System.out.println(emp.getEmpInfo1().getEmpName());
		System.out.println(emp.getEmpInfo1().getEmpDesg());

		System.out.println(emp.getEmpInfo2().getEmpId());
		System.out.println(emp.getEmpInfo2().getEmpName());
		System.out.println(emp.getEmpInfo2().getEmpDesg());

		System.out.println(emp.getEmpInfo3().getEmpId());
		System.out.println(emp.getEmpInfo3().getEmpName());
		System.out.println(emp.getEmpInfo3().getEmpDesg());

	}

}
