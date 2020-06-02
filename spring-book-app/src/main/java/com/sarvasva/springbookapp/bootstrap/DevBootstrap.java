package com.sarvasva.springbookapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.sarvasva.springbookapp.models.Author;
import com.sarvasva.springbookapp.models.Book;
import com.sarvasva.springbookapp.repositories.AuthorRepository;
import com.sarvasva.springbookapp.repositories.BookRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	AuthorRepository authorRepository;
	BookRepository	bookRepository;
	
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}


	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		Author  chetanBaghat=new Author("Chetan Bhagat");
		Author jkRowLing=new Author("JK Rowling");
		Book fps=new Book("Five Point Someone","Publisher 1");
		Book ts=new Book("2 States","Publisher 1");
		Book hp=new Book("Harry Potter and Philospher stone","Publisher 2");
		chetanBaghat.getBooks().add(fps);
		chetanBaghat.getBooks().add(ts);
		jkRowLing.getBooks().add(hp);
		fps.getAuthors().add(chetanBaghat);
		ts.getAuthors().add(chetanBaghat);
		hp.getAuthors().add(jkRowLing);
		
		authorRepository.save(chetanBaghat);
		authorRepository.save(jkRowLing);
		bookRepository.save(fps);
		bookRepository.save(ts);
		bookRepository.save(hp);
		
		
				
		
		
		
		
		
		
		
		
				
		
	}

}
