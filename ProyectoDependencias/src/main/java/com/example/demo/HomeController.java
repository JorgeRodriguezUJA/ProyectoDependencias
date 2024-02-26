package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@Autowired
	DAOInterface dao;
	
	@GetMapping(value="/version")
	public String metodo(Model model) {
		
		//dao = new DAOTest();
		model.addAttribute("texto", dao .version());
		return "vista";
	}
	
}
