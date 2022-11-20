package dev.franklinjpt.petclinic.api;

import dev.franklinjpt.petclinic.api.dto.mapper.CrudMapper;
import dev.franklinjpt.petclinic.business.AbstractCrudService;
import dev.franklinjpt.petclinic.domain.DomainEntity;

import java.util.Collection;

public abstract class AbstractCrudController<E extends DomainEntity<ID>, D, ID> {

    protected AbstractCrudService<E, ID> service;

    protected CrudMapper<E, D> mapper;

    public AbstractCrudController(AbstractCrudService<E, ID> service, CrudMapper<E, D> mapper) {
        this.service = service;
        this.mapper = mapper;
    }

//    public Collection<D> readAll() {
//
//    }
}
