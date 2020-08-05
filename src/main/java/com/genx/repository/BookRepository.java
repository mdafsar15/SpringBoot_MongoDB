package com.genx.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.genx.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
