package example.spring.project.springpetclinic.repositories;

import example.spring.project.springpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
