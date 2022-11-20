package dev.franklinjpt.petclinic.api.dto.mapper;

public interface CrudMapper<E, D> {

    E toEntity(D dto);
    D toDto(E entity);
}
