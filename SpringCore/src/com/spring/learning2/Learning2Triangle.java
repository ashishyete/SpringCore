/**
 * 
 */
package com.spring.learning2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ashish
 *
 */
public class Learning2Triangle implements Learning2Shape {
	Logger log = LoggerFactory.getLogger(Learning2Triangle.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.learning2.Learning2Shape#draw()
	 */
	@Override
	public void draw() {
		log.info("Inside draw() of Learning2Triangle");
		System.out.println("Triangle to be drawn!");

	}

}
