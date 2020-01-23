package br.com.gft.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/port")
public class PortController {

	@RequestMapping
	
	public String Menu() {
		
		return "Layout";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "About";
	}
	
	
}
