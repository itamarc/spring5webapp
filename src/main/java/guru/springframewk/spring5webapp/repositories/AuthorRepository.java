package guru.springframewk.spring5webapp.repositories;

import guru.springframewk.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
