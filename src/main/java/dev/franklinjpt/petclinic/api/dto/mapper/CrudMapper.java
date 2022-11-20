package dev.franklinjpt.petclinic.api.dto.mapper;

import java.util.Collection;

public interface CrudMapper<E, D> {

    E toEntity(D dto);
    Collection<E> toEntities(Collection<D> dtos);
    D toDto(E entity);
    Collection<D> toDtos(Collection<E> entities);
}
