package guru.springframewk.spring5webapp.repositories;

import guru.springframewk.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
