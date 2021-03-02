package example.spring.project.springpetclinic.repositories;

import example.spring.project.springpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
