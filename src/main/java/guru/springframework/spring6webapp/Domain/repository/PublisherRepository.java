package guru.springframework.spring6webapp.Domain.repository;

import guru.springframework.spring6webapp.Domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}