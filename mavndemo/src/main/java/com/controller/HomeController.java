package com.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	public HomeController(){
		System.out.println("CONSTRUCTING HOMECONTROLLER");
	}
@RequestMapping("/")
public String homePage() {
	return "homepage";
	}

}
