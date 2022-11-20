package dev.franklinjpt.petclinic.api;

import dev.franklinjpt.petclinic.api.dto.OwnerDto;
import dev.franklinjpt.petclinic.api.dto.mapper.OwnerMapper;
import dev.franklinjpt.petclinic.business.OwnerService;
import dev.franklinjpt.petclinic.domain.Owner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/owner")
public class OwnerController extends AbstractCrudController<Owner, OwnerDto, String> {

    public OwnerController(OwnerService service, OwnerMapper mapper) {
        super(service, mapper);
    }
}
