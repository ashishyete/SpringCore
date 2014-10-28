/**
 * 
 */
package com.spring.learning4;

/**
 * @author Ashish
 *
 */
public class Learning4Rectangle {

	/**
	 * 
	 */
	private double width;
	private double height;
	private String name;

	public Learning4Rectangle(double width, double height, String name) {
		this.width = width;
		this.height = height;
		this.name = name;
	}

	public double area() {
		return height * width;
	}

	public String showName() {
		return name;
	}

}
