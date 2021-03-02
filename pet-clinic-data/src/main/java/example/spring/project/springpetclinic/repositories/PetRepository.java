package example.spring.project.springpetclinic.repositories;

import example.spring.project.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
