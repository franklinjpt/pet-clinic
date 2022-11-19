package dev.franklinjpt.petclinic.business;

import dev.franklinjpt.petclinic.dao.OwnerJpaRepository;
import dev.franklinjpt.petclinic.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerService extends AbstractCrudService<Owner, String>{

    protected OwnerService(OwnerJpaRepository ownnerRepository) {
        super(ownnerRepository);
    }
}
