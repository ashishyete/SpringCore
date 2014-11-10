/**
 * 
 */
package com.spring.learning8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ashish
 *
 */
public class Learning8App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");
		Learning8Car car = (Learning8Car) context.getBean("car");

		System.out.println(car.getCarInfo1().getCarId());
		System.out.println(car.getCarInfo1().getCarName());
		System.out.println(car.getCarInfo1().getCarMileage());

		System.out.println(car.getCarInfo2().getCarId());
		System.out.println(car.getCarInfo2().getCarName());
		System.out.println(car.getCarInfo2().getCarMileage());

		System.out.println(car.getCarInfo3().getCarId());
		System.out.println(car.getCarInfo3().getCarName());
		System.out.println(car.getCarInfo3().getCarMileage());

	}

}
