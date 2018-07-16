package araf.springframework.spring5test1.repository;

import araf.springframework.spring5test1.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
