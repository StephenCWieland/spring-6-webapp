package guru.springframework.spring6webapp.Domain.repository;

import guru.springframework.spring6webapp.Domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {;
}
