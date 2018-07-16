package araf.springframework.spring5test1.repository;

import araf.springframework.spring5test1.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
