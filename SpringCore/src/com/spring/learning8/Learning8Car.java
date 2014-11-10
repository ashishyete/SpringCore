/**
 * 
 */
package com.spring.learning8;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Ashish
 *
 */
public class Learning8Car implements ApplicationContextAware,BeanNameAware{

	private Learning8CarInfo carInfo1;
	private Learning8CarInfo carInfo2;
	private Learning8CarInfo carInfo3;

	private ApplicationContext context;
	
	/**
	 * @return the carInfo1
	 */
	public Learning8CarInfo getCarInfo1() {
		return carInfo1;
	}

	/**
	 * @param carInfo1
	 *            the carInfo1 to set
	 */
	public void setCarInfo1(Learning8CarInfo carInfo1) {
		this.carInfo1 = carInfo1;
	}

	/**
	 * @return the carInfo2
	 */
	public Learning8CarInfo getCarInfo2() {
		return carInfo2;
	}

	/**
	 * @param carInfo2
	 *            the carInfo2 to set
	 */
	public void setCarInfo2(Learning8CarInfo carInfo2) {
		this.carInfo2 = carInfo2;
	}

	/**
	 * @return the carInfo3
	 */
	public Learning8CarInfo getCarInfo3() {
		return carInfo3;
	}

	/**
	 * @param carInfo3
	 *            the carInfo3 to set
	 */
	public void setCarInfo3(Learning8CarInfo carInfo3) {
		this.carInfo3 = carInfo3;
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context=context;
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Learning8Car Defined Bean Name is : "+beanName);
		
	}

	
}
