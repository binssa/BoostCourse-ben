package com.benworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benworld.dao.OfferDAO;
import com.benworld.model.Offer;

@Service
public class OffersService {
	
	private OfferDAO offerDAO;

	@Autowired
	public void setOfferDAO(OfferDAO offerDAO) {
		this.offerDAO = offerDAO;
	}

	public List<Offer> getCurrent() {
		return offerDAO.getOffers();
	}

	public void insert(Offer offer) {

		offerDAO.insert(offer);
	}
	
	
}
