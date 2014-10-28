/**
 * 
 */
package com.spring.learning2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * @author Ashish
 *
 */
public class Learning2App {

	/**
	 * 
	 */
	public Learning2App() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Learning2Shape shape;
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		shape = (Learning2Shape) factory.getBean("square");
		shape.draw();
		
		shape=(Learning2Shape) factory.getBean("triangle");
		shape.draw();
	}

}
