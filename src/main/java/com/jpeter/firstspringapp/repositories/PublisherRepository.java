package com.jpeter.firstspringapp.repositories;

import com.jpeter.firstspringapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
