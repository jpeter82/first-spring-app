package com.jpeter.firstspringapp.repositories;

import com.jpeter.firstspringapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
