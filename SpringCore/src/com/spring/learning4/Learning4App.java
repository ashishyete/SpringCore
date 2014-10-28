/**
 * 
 */
package com.spring.learning4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ashish
 *
 */
public class Learning4App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");
		Learning4Circle circle = (Learning4Circle) context
				.getBean("learning4circle");
		circle.draw();
		System.out.println(circle.getRadius());

		Learning4Triangle triangle = (Learning4Triangle) context
				.getBean("learning4triangle");
		triangle.draw();
		System.out.println(triangle.getArea());

	}
}
