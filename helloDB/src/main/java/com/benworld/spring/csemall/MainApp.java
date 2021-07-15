package com.benworld.spring.csemall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/benworld/spring/csemall/beans/beans.xml");
		
		OfferDAO offerDAO = (OfferDAO) context.getBean("offerDAO");
		System.out.println("Row Count : " + offerDAO.getRowCount());
		
		context.close();
	}

}
