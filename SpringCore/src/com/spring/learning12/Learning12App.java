package com.spring.learning12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Learning12App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");

		Learning12Project p = (Learning12Project) context
				.getBean("learning12Project");
		System.out.println("**********getting informtion**************");
		System.out.println(p.getLearning12ProjectInfo1().getProjectId());
		System.out.println(p.getLearning12ProjectInfo1().getProjectName());
		System.out.println(p.getLearning12ProjectInfo1().getProjectDetails());
		System.out.println("**********getting informtion**************");
		System.out.println(p.getLearning12ProjectInfo2().getProjectId());
		System.out.println(p.getLearning12ProjectInfo2().getProjectName());
		System.out.println(p.getLearning12ProjectInfo2().getProjectDetails());
		System.out.println("**********getting informtion**************");
		System.out.println(p.getLearning12ProjectInfo3().getProjectId());
		System.out.println(p.getLearning12ProjectInfo3().getProjectName());
		System.out.println(p.getLearning12ProjectInfo3().getProjectDetails());
		System.out.println("**********getting informtion**************");
		System.out.println(p.getLearning12ProjectInfo4().getProjectId());
		System.out.println(p.getLearning12ProjectInfo4().getProjectName());
		System.out.println(p.getLearning12ProjectInfo4().getProjectDetails());

	}

}
