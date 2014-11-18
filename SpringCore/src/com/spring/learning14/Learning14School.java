/**
 * 
 */
package com.spring.learning14;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author Ashish
 *
 */
public class Learning14School {

	Learning14SchoolInfo schoolInformation1;
	Learning14SchoolInfo schoolInformation2;
	Learning14SchoolInfo schoolInformation3;

	public Learning14SchoolInfo getSchoolInformation1() {
		return schoolInformation1;
	}
	@Resource(name="schoolInformation3")
	public void setSchoolInformation1(Learning14SchoolInfo schoolInformation1) {
		this.schoolInformation1 = schoolInformation1;
	}

	public Learning14SchoolInfo getSchoolInformation2() {
		return schoolInformation2;
	}
	@Resource(name="schoolInformation2")
	public void setSchoolInformation2(Learning14SchoolInfo schoolInformation2) {
		this.schoolInformation2 = schoolInformation2;
	}

	public Learning14SchoolInfo getSchoolInformation3() {
		return schoolInformation3;
	}
	@Resource(name="schoolInformation1")
	public void setSchoolInformation3(Learning14SchoolInfo schoolInformation3) {
		this.schoolInformation3 = schoolInformation3;
	}

	
	@PostConstruct
	public void initilizeLearning14School(){
		System.out.println("initializing Learning14School");
	}
	
	@PreDestroy
	public void destroyLearning14School(){
		System.out.println("destroying Learning14School");
	}
	
	
}
