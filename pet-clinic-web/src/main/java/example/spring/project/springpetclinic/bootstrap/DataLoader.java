package example.spring.project.springpetclinic.bootstrap;

import example.spring.project.springpetclinic.model.Owner;
import example.spring.project.springpetclinic.model.PetType;
import example.spring.project.springpetclinic.model.Vet;
import example.spring.project.springpetclinic.services.OwnerService;
import example.spring.project.springpetclinic.services.PetTypeService;
import example.spring.project.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Adam");
        owner1.setLastName("Kowal");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Julia");
        owner2.setLastName("Nowak");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Wojciech");
        vet1.setLastName("Niedziela");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Kacper");
        vet2.setLastName("Wujek");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
