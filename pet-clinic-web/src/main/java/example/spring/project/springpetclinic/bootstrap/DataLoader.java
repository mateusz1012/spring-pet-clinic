package example.spring.project.springpetclinic.bootstrap;

import example.spring.project.springpetclinic.model.Owner;
import example.spring.project.springpetclinic.model.Vet;
import example.spring.project.springpetclinic.services.OwnerService;
import example.spring.project.springpetclinic.services.VetService;
import example.spring.project.springpetclinic.services.map.OwnerServiceMap;
import example.spring.project.springpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Adam");
        owner1.setLastName("Kowal");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Julia");
        owner2.setLastName("Nowak");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Wojciech");
        vet1.setLastName("Niedziela");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Kacper");
        vet2.setLastName("Wujek");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
