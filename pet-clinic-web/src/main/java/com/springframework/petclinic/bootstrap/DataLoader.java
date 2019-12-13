package com.springframework.petclinic.bootstrap;

import com.springframework.petclinic.model.Owner;
import com.springframework.petclinic.model.Vet;
import com.springframework.petclinic.services.OwnerService;
import com.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }
    @Override
    public void run(String... args) throws Exception{

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Tom");
        owner1.setLastName("Sawyer");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Huck");
        owner2.setLastName("Finn");

        ownerService.save(owner2);

        System.out.println("Loaded " + owner1.getFirstName() + " and " + owner2.getFirstName());

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Samuel");
        vet1.setLastName("Clemens");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Mark");
        vet2.setLastName("Twain");

        vetService.save(vet2);

        System.out.println("Loaded " + vet1.getFirstName() + " and " + vet2.getFirstName());






    }
}
