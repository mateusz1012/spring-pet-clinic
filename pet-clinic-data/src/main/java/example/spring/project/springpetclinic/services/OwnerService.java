package example.spring.project.springpetclinic.services;

import example.spring.project.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
