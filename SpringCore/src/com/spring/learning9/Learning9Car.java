/**
 * 
 */
package com.spring.learning9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author ayete
 *
 */
public class Learning9Car implements InitializingBean,DisposableBean{

	private Learning9CarInfo learning9CarInfo1;
	private Learning9CarInfo learning9CarInfo2;

	public Learning9CarInfo getLearning9CarInfo1() {
		return learning9CarInfo1;
	}

	public void setLearning9CarInfo1(Learning9CarInfo learning9CarInfo1) {
		this.learning9CarInfo1 = learning9CarInfo1;
	}

	public Learning9CarInfo getLearning9CarInfo2() {
		return learning9CarInfo2;
	}

	public void setLearning9CarInfo2(Learning9CarInfo learning9CarInfo2) {
		this.learning9CarInfo2 = learning9CarInfo2;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean for Learning9Car is called! -- init Method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean for Learning9Car is called! -- Destroy Method");
		
	}
	
	public void initLearning9Car(){
		System.out.println("Learning9Car userDefined Init method is called!");
	}
	
	public void destroyLearning9Car(){
		System.out.println("Learning9Car userDefined Destroy method is called!");
	}
	

}
