package araf.springframework.spring5test1.repository;

import araf.springframework.spring5test1.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
