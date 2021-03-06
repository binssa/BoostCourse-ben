package com.benworld.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import com.benworld.model.Offer;
import com.benworld.service.OffersService;

@Controller
public class OffersController {
	
	private OffersService offersService;
	
	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping("/offers")
	public String showOffers(Model model) {
		
		List<Offer> offers = offersService.getCurrent();
		model.addAttribute("offers", offers);
		
		return "offers";
	}
	
	@RequestMapping("/createOffer")
	public String createOffers(Model model) {
		
		// Spring Form을 사용하기 위한 Offer 객체 생성 
		model.addAttribute(new Offer());
		return "createOffer";
	}
	
	@RequestMapping("/doCreate")
	public String doCreateOffer(Model model, @Valid Offer offer, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("Form data does not validate");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error : errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "createOffer";
		}
		offersService.insert(offer);
		return "offerCreated";
	}

}
