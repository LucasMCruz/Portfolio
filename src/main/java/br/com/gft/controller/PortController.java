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
	public String Sobre() {
		return "About";
	}
	@RequestMapping("/services")
	public String Skill() {
		return "Services";
	}
	
	@RequestMapping("/work")
	public String Work() {
		return "Work";
	}
	@RequestMapping("/blog")
	public String LifeStyle() {
		return "Blog";
	}
	@RequestMapping("/contato")
	public String Contact() {
		return "Contato";
	}
	
}
