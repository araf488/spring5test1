package araf.springframework.spring5test1.bootstrap;

import araf.springframework.spring5test1.model.Author;
import araf.springframework.spring5test1.model.Book;
import araf.springframework.spring5test1.model.Publisher;
import araf.springframework.spring5test1.repository.AuthorRepository;
import araf.springframework.spring5test1.repository.BookRepository;
import araf.springframework.spring5test1.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DebBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisherRepository.save(publisher);

        //DataOne
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        //DataTwo
        Author rod = new Author("Rod", "Johnson");
        Book jjj = new Book("J2EE Development without EJB", "2345", publisher);
        rod.getBooks().add(jjj);
        //jjj.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(jjj);
    }


}
