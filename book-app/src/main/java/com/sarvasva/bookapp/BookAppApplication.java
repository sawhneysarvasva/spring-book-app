package com.sarvasva.bookapp;

import org.springframework.boot.SpringApplication;
import javax.persistence.Id;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Entity
@SpringBootApplication
public class BookAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookAppApplication.class, args);
	}

}
