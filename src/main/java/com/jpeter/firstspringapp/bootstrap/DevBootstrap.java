package com.jpeter.firstspringapp.bootstrap;

import com.jpeter.firstspringapp.model.Author;
import com.jpeter.firstspringapp.model.Book;
import com.jpeter.firstspringapp.model.Publisher;
import com.jpeter.firstspringapp.repositories.AuthorRepository;
import com.jpeter.firstspringapp.repositories.BookRepository;
import com.jpeter.firstspringapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private PublisherRepository publisherRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, PublisherRepository publisherRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        // Example #1
        Author ken = new Author("Ken", "Follett");
        Publisher gem = new Publisher("Gemini", "Somwhere 9.");
        Book nith = new Book("Needle in the Haystack", "ABC123", gem);
        ken.getBooks().add(nith);
        nith.getAuthors().add(ken);

        authorRepository.save(ken);
        publisherRepository.save(gem);
        bookRepository.save(nith);

        // Example #2
        Author mala = new Author("Mala", "Gupta");
        Publisher ore = new Publisher("OReilly", "Anywhere 11.");
        Book jia = new Book("Java in Action", "DEF456", ore);
        mala.getBooks().add(jia);
        jia.getAuthors().add(mala);

        authorRepository.save(mala);
        publisherRepository.save(ore);
        bookRepository.save(jia);

    }


}
