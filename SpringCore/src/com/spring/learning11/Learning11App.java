/**
 * 
 */
package com.spring.learning11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ashish
 *
 */
public class Learning11App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Learning11Shape shape =(Learning11Shape) context.getBean("learning11rectangle");
		shape.draw();
		
	}

}
