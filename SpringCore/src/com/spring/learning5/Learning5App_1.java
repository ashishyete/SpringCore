/**
 * 
 */
package com.spring.learning5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ashish
 *
 */
public class Learning5App_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Learning5Car car = (Learning5Car)context.getBean("learning5car-alias");
		
		System.out.println("Loading Car Information 1");
		System.out.println("Car Type : " +car.getCarinfo1().getCarType());
		System.out.println("Car Brand : " +car.getCarinfo1().getCarBrand());
		System.out.println("Car Price : " +car.getCarinfo1().getCarPrice());
		System.out.println("Car Avg : " +car.getCarinfo1().getCarAvg());
		System.out.println("Loading Car Information 2");
		System.out.println("Car Type : " +car.getCarinfo2().getCarType());
		System.out.println("Car Brand : " +car.getCarinfo2().getCarBrand());
		System.out.println("Car Price : " +car.getCarinfo2().getCarPrice());
		System.out.println("Car Avg : " +car.getCarinfo2().getCarAvg());
		
	}

}
