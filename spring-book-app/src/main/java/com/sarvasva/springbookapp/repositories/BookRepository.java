package com.sarvasva.springbookapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sarvasva.springbookapp.models.Book;

public interface BookRepository extends CrudRepository<Book, Long>
{

}
