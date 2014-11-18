/**
 * 
 */
package com.spring.learning13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ashish
 *
 */
public class Learning13App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context1.xml");
		Learning13School school = (Learning13School) context
				.getBean("learning13school");
		System.out.println(school.getSchoolInfo1().getSchoolId());
		System.out.println(school.getSchoolInfo1().getSchoolName());
		System.out.println(school.getSchoolInfo1().getSchoolRanking());
		
		System.out.println(school.getSchoolInfo2().getSchoolId());
		System.out.println(school.getSchoolInfo2().getSchoolName());
		System.out.println(school.getSchoolInfo2().getSchoolRanking());
		
		System.out.println(school.getSchoolInfo3().getSchoolId());
		System.out.println(school.getSchoolInfo3().getSchoolName());
		System.out.println(school.getSchoolInfo3().getSchoolRanking());

	}

}
