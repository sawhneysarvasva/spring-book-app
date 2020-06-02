package com.sarvasva.springbookapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.sarvasva.springbookapp.models.Author;
import com.sarvasva.springbookapp.models.Book;
import com.sarvasva.springbookapp.models.Publisher;
import com.sarvasva.springbookapp.repositories.AuthorRepository;
import com.sarvasva.springbookapp.repositories.BookRepository;
import com.sarvasva.springbookapp.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	AuthorRepository authorRepository;
	BookRepository	bookRepository;
	PublisherRepository publisherRepository;
	
	
	
	

	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}





	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		Publisher pubisher1=new Publisher("Publisher1","Publisher Address 1");
		Publisher pubisher2=new Publisher("Publisher2","Publisher Address 2");
		publisherRepository.save(pubisher1);
		publisherRepository.save(pubisher2);
		
		Author  chetanBaghat=new Author("Chetan Bhagat");
		Author jkRowLing=new Author("JK Rowling");
		
		
		Book fps=new Book("Five Point Someone",pubisher1);
		Book ts=new Book("2 States",pubisher1);
		Book hp=new Book("Harry Potter and Philospher stone",pubisher2);
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
