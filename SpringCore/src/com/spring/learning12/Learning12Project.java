/**
 * 
 */
package com.spring.learning12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author ayete
 *
 */
public class Learning12Project {

	private Learning12ProjectInfo learning12ProjectInfo1;
	private Learning12ProjectInfo learning12ProjectInfo2;
	private Learning12ProjectInfo learning12ProjectInfo3;
	private Learning12ProjectInfo learning12ProjectInfo4;

	public Learning12ProjectInfo getLearning12ProjectInfo1() {
		return learning12ProjectInfo1;
	}

	@Autowired
	@Qualifier("learning12ProjectInfo1")
	public void setLearning12ProjectInfo1(
			Learning12ProjectInfo learning12ProjectInfo1) {
		this.learning12ProjectInfo1 = learning12ProjectInfo1;
	}

	public Learning12ProjectInfo getLearning12ProjectInfo2() {
		return learning12ProjectInfo2;
	}

	@Autowired
	@Qualifier("learning12ProjectInfo2")
	public void setLearning12ProjectInfo2(
			Learning12ProjectInfo learning12ProjectInfo2) {
		this.learning12ProjectInfo2 = learning12ProjectInfo2;
	}

	public Learning12ProjectInfo getLearning12ProjectInfo3() {
		return learning12ProjectInfo3;
	}

	@Autowired
	@Qualifier("learning12ProjectInfo3")
	public void setLearning12ProjectInfo3(
			Learning12ProjectInfo learning12ProjectInfo3) {
		this.learning12ProjectInfo3 = learning12ProjectInfo3;
	}

	public Learning12ProjectInfo getLearning12ProjectInfo4() {
		return learning12ProjectInfo4;
	}

	@Autowired
	@Qualifier("learning12ProjectInfo4")
	public void setLearning12ProjectInfo4(
			Learning12ProjectInfo learning12ProjectInfo4) {
		this.learning12ProjectInfo4 = learning12ProjectInfo4;
	}

}
