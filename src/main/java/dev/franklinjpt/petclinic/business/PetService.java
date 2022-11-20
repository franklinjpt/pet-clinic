package dev.franklinjpt.petclinic.business;

import dev.franklinjpt.petclinic.dao.PetRepository;
import dev.franklinjpt.petclinic.domain.Pet;
import org.springframework.stereotype.Service;

@Service
public class PetService extends AbstractCrudService<Pet, Long>{

    protected PetService(PetRepository petRepository) {
        super(petRepository);
    }
}
