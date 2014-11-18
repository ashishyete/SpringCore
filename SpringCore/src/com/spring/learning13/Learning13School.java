/**
 * 
 */
package com.spring.learning13;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ashish
 *
 */
public class Learning13School {

	Learning13SchoolInfo schoolInfo1;
	Learning13SchoolInfo schoolInfo2;
	Learning13SchoolInfo schoolInfo3;

	/**
	 * @return the schoolInfo1
	 */
	public Learning13SchoolInfo getSchoolInfo1() {
		return schoolInfo1;
	}

	/**
	 * @param schoolInfo1
	 *            the schoolInfo1 to set
	 */
	@Autowired
	public void setSchoolInfo1(Learning13SchoolInfo schoolInfo1) {
		this.schoolInfo1 = schoolInfo1;
	}

	/**
	 * @return the schoolInfo2
	 */
	public Learning13SchoolInfo getSchoolInfo2() {
		return schoolInfo2;
	}

	/**
	 * @param schoolInfo2
	 *            the schoolInfo2 to set
	 */
	@Autowired
	public void setSchoolInfo2(Learning13SchoolInfo schoolInfo2) {
		this.schoolInfo2 = schoolInfo2;
	}

	/**
	 * @return the schoolInfo3
	 */
	public Learning13SchoolInfo getSchoolInfo3() {
		return schoolInfo3;
	}

	/**
	 * @param schoolInfo3
	 *            the schoolInfo3 to set
	 */
	@Autowired
	public void setSchoolInfo3(Learning13SchoolInfo schoolInfo3) {
		this.schoolInfo3 = schoolInfo3;
	}

}
