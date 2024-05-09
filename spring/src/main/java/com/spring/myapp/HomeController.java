package com.spring.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller	
public class HomeController {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("welcomehome{}.",locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formatDate = dateFormat.format(date);
		
		model.addAttribute("serverTime",formatDate);
		model.addAttribute("author","123");
		model.addAttribute("company","333");
		return "home";
	}
}
