package dev.franklinjpt.petclinic.api;

import dev.franklinjpt.petclinic.api.dto.PetDto;

import dev.franklinjpt.petclinic.api.dto.mapper.PetMapper;
import dev.franklinjpt.petclinic.business.PetService;
import dev.franklinjpt.petclinic.domain.Pet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pet")
public class PetController extends AbstractCrudController<Pet, PetDto, Long> {
    public PetController(PetService service, PetMapper mapper) {
        super(service, mapper);
    }
}
