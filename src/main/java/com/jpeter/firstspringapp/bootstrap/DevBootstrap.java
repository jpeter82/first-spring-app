package com.jpeter.firstspringapp.bootstrap;

import com.jpeter.firstspringapp.model.Author;
import com.jpeter.firstspringapp.model.Book;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        // Example #1
        Author ken = new Author("Ken", "Follett");
        Book nith = new Book("Needle in the Haystack", "ABC123", "Gemini");
        ken.getBooks().add(nith);
        nith.getAuthors().add(ken);

        // Example #2
        Author mala = new Author("Mala", "Gupta");
        Book jia = new Book("Java in Action", "DEF456", "OReilly");
        mala.getBooks().add(jia);
        jia.getAuthors().add(mala);


    }
}
