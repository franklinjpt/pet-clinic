package dev.franklinjpt.petclinic.api.dto.mapper;

import dev.franklinjpt.petclinic.api.dto.PetDto;
import dev.franklinjpt.petclinic.domain.Pet;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PetMapper extends CrudMapper<Pet, PetDto> {
}
