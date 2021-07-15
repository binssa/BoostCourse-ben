package com.benworld.spring.csemall;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/benworld/spring/csemall/beans/beans.xml");
		
		OfferDAO offerDAO = (OfferDAO) context.getBean("offerDAO");
		System.out.println("Row Count : " + offerDAO.getRowCount());
		
		List<Offer> offerList = offerDAO.getOffers();
		for(Offer offer: offerList) {
			System.out.println(offer);
		}
		
		Offer offer = offerDAO.getOffer("sa");
		System.out.println(offer);
		
		Offer insertOffer = new Offer("Ji", "ji@abc.com", "This is Ji");
		if(offerDAO.insert(insertOffer)) {
			System.out.println("Object is inserted successfully");
			System.out.println(offerDAO.getOffer(insertOffer.getName()));
		}else {
			System.out.println("Insert Failed");
		}
		
		
		context.close();
	}

}