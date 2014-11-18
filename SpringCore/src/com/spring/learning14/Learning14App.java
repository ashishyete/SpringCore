/**
 * 
 */
package com.spring.learning14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ashish
 *
 */
public class Learning14App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context1.xml");
		Learning14School school = (Learning14School) context
				.getBean("learning14school");
		System.out.println(school.getSchoolInformation1().getSchoolId());
		System.out.println(school.getSchoolInformation1().getSchoolName());
		System.out.println(school.getSchoolInformation1().getSchoolRanking());
		
		System.out.println(school.getSchoolInformation2().getSchoolId());
		System.out.println(school.getSchoolInformation2().getSchoolName());
		System.out.println(school.getSchoolInformation2().getSchoolRanking());
		
		System.out.println(school.getSchoolInformation3().getSchoolId());
		System.out.println(school.getSchoolInformation3().getSchoolName());
		System.out.println(school.getSchoolInformation3().getSchoolRanking());

	}

}
