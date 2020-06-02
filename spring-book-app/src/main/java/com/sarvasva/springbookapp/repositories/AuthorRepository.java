package com.sarvasva.springbookapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sarvasva.springbookapp.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
