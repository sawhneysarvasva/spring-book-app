package com.sarvasva.springbookapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sarvasva.springbookapp.repositories.BookRepository;

@Controller
public class BookController {
	BookRepository bookRepository;
	
	
	public BookController(BookRepository bookRepository) {
		
		this.bookRepository = bookRepository;
	}


	@RequestMapping("/books")
	String getBooks(Model model) {
		model.addAttribute("books",bookRepository.findAll());
		return "books";
	}

}
