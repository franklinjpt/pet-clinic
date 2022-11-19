package dev.franklinjpt.petclinic.business;

import dev.franklinjpt.petclinic.dao.PetJpaRepository;
import dev.franklinjpt.petclinic.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PetService extends AbstractCrudService<Pet, Long>{

    protected PetService(PetJpaRepository petRepository) {
        super(petRepository);
    }
}
