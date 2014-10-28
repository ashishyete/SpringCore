/**
 * 
 */
package com.spring.learning3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ashish
 *
 */
public class Learning3App {

	/**
	 * 
	 */
	public Learning3App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Learning3Shape shape;

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");
		shape = (Learning3Shape) context.getBean("learning3rectangle");
		shape.draw();

		shape = (Learning3Shape) context.getBean("learning3triangle");
		shape.draw();

	}

}
