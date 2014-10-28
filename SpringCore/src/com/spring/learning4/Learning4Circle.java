/**
 * 
 */
package com.spring.learning4;

/**
 * @author Ashish
 *
 */
public class Learning4Circle implements Learning4Shape {

	/**
	 * 
	 */
	public Learning4Circle() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.learning4.Learning4Shape#draw()
	 */
	private String radius;

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle of Learning4Circle is to be drawn");

	}

}
