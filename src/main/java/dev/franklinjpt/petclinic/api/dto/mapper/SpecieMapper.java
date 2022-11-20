package dev.franklinjpt.petclinic.api.dto.mapper;

import dev.franklinjpt.petclinic.api.dto.SpecieDto;
import dev.franklinjpt.petclinic.domain.Specie;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SpecieMapper extends CrudMapper<Specie, SpecieDto>{
}
