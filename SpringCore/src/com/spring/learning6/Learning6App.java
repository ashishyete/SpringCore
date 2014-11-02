/**
 * 
 */
package com.spring.learning6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ashish
 *
 */
public class Learning6App {

	/**`
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Learning6Vehicle veh = (Learning6Vehicle)context.getBean("learning6vehicle");
		
		for(Learning6VehicleInfo v :veh.vehicleInfo){
			System.out.println(v.getVehicleType());
			System.out.println(v.getVehicleModel());
			System.out.println(v.getVehicleUsage());
		}
		
		
	}

}
