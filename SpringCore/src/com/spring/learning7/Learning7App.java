/**
 * 
 */
package com.spring.learning7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ashish
 *
 */
public class Learning7App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Learning7Vehicle ve= (Learning7Vehicle)context.getBean("learning7vehicle");
		System.out.println("Loading vehicle 1 Properties");
		System.out.println(ve.getLearning7vehicleInfo1().getVehicleType());
		System.out.println(ve.getLearning7vehicleInfo1().getVehicleModel());
		System.out.println(ve.getLearning7vehicleInfo1().getVehicleUsage());
		System.out.println("Loading vehicle 2 Properties");
		System.out.println(ve.getLearning7vehicleInfo2().getVehicleType());
		System.out.println(ve.getLearning7vehicleInfo2().getVehicleModel());
		System.out.println(ve.getLearning7vehicleInfo2().getVehicleUsage());
		
		
	}

}
