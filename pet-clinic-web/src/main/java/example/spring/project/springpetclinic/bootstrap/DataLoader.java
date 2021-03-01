package example.spring.project.springpetclinic.bootstrap;

import example.spring.project.springpetclinic.model.*;
import example.spring.project.springpetclinic.services.OwnerService;
import example.spring.project.springpetclinic.services.PetTypeService;
import example.spring.project.springpetclinic.services.SpecialtyService;
import example.spring.project.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialtyService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialtyService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Adam");
        owner1.setLastName("Kowal");
        owner1.setAddress("ul. Wojska Polskiego 00");
        owner1.setCity("Warszawa");
        owner1.setTelephone("111 222 111");

        Pet adamsPet = new Pet();
        adamsPet.setName("Maczo");
        adamsPet.setPetType(savedDogPetType);
        adamsPet.setOwner(owner1);
        adamsPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(adamsPet);

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Julia");
        owner2.setLastName("Nowak");
        owner2.setAddress("ul. Węglowa 4");
        owner2.setCity("Poznań");
        owner2.setTelephone("000 999 000");

        Pet juliPet = new Pet();
        juliPet.setName("Misio");
        juliPet.setPetType(savedCatPetType);
        juliPet.setOwner(owner2);
        juliPet.setBirthDate(LocalDate.now());
        owner2.getPets().add(juliPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");


        Vet vet1 = new Vet();
        vet1.setFirstName("Wojciech");
        vet1.setLastName("Niedziela");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Kacper");
        vet2.setLastName("Wujek");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
