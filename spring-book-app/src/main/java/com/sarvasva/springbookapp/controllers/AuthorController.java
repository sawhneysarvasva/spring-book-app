package com.sarvasva.springbookapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sarvasva.springbookapp.repositories.AuthorRepository;

@Controller
public class AuthorController {
	AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		
		this.authorRepository = authorRepository;
	}
	@GetMapping("/authors")
	public String getAuthors(Model model) {
		model.addAttribute("authors",authorRepository.findAll());
		return "authors";
	}
	
}
