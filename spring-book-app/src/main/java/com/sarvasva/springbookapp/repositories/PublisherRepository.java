package com.sarvasva.springbookapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sarvasva.springbookapp.models.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
