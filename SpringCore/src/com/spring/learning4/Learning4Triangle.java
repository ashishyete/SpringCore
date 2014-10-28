/**
 * 
 */
package com.spring.learning4;

/**
 * @author Ashish
 *
 */
public class Learning4Triangle implements Learning4Shape{

	/**
	 * 
	 */
	public Learning4Triangle() {
		// TODO Auto-generated constructor stub
				
	}
	
	private String area;


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	@Override
	public void draw() {
		System.out.println("Triangle of Learning4Triangle is to be drawn");
		
	}


}
