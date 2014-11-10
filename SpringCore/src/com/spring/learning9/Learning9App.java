/**
 * 
 */
package com.spring.learning9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ayete
 *
 */
public class Learning9App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		context.registerShutdownHook();

		Learning9Car car = (Learning9Car) context.getBean("learning9Car");

		System.out.println(car.getLearning9CarInfo1().getCarId());
		System.out.println(car.getLearning9CarInfo1().getCarName());
		System.out.println(car.getLearning9CarInfo2().getCarId());
		System.out.println(car.getLearning9CarInfo2().getCarName());

	}

}
