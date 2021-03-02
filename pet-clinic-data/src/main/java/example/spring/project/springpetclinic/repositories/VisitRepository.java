package example.spring.project.springpetclinic.repositories;

import example.spring.project.springpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
