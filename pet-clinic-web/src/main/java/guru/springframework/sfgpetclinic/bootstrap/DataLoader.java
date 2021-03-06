package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService)
    {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args)
    {
        System.out.println("Loading owners ... ... ...");

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Megan");
        owner2.setLastName("Connor");
        ownerService.save(owner2);

        System.out.println("Loading vets ... ... ...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Porter");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Nick");
        vet2.setLastName("Nack");
        vetService.save(vet2);
    }
}
