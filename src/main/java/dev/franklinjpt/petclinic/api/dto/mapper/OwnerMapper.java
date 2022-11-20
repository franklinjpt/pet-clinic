package dev.franklinjpt.petclinic.api.dto.mapper;

import dev.franklinjpt.petclinic.api.dto.OwnerDto;
import dev.franklinjpt.petclinic.domain.Owner;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OwnerMapper extends CrudMapper<Owner, OwnerDto> {
}
