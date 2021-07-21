package com.benworld.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//	private static final Logger logger = LoggerFactory.getLogger("com.benworld.HomeController");와 같은 기능 
	// http://localhost:8080/helloSpringMVC/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome(Locale locale, Model model) {
		
		logger.trace("trace level : Welecom home! The Client locale is {}", locale);
		logger.debug("debug level : Welecom home! The Client locale is {}", locale);
		logger.info("info level : Welecom home! The Client locale is {}", locale);
		logger.warn("warn level : Welecom home! The Client locale is {}", locale);
		logger.error("error level : Welecom home! The Client locale is {}", locale);
		
		return "home"; // view's Logical Name
	}
	
}
