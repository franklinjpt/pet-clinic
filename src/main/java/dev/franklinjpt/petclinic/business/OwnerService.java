package dev.franklinjpt.petclinic.business;

import dev.franklinjpt.petclinic.dao.OwnerRepository;
import dev.franklinjpt.petclinic.domain.Owner;
import org.springframework.stereotype.Service;

@Service
public class OwnerService extends AbstractCrudService<Owner, String>{

    protected OwnerService(OwnerRepository ownnerRepository) {
        super(ownnerRepository);
    }
}
