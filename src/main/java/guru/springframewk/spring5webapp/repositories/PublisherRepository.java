package guru.springframewk.spring5webapp.repositories;

import guru.springframewk.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
