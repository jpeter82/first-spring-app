package com.jpeter.firstspringapp.repositories;

import com.jpeter.firstspringapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
