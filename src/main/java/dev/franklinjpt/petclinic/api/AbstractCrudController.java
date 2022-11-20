package dev.franklinjpt.petclinic.api;

import dev.franklinjpt.petclinic.api.dto.mapper.CrudMapper;
import dev.franklinjpt.petclinic.business.AbstractCrudService;
import dev.franklinjpt.petclinic.domain.DomainEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;

public abstract class AbstractCrudController<E extends DomainEntity<ID>, D, ID> {

    protected AbstractCrudService<E, ID> service;

    protected CrudMapper<E, D> mapper;

    public AbstractCrudController(AbstractCrudService<E, ID> service, CrudMapper<E, D> mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public D create(@RequestBody D dto) {
        return mapper.toDto(service.create(mapper.toEntity(dto)));
    }

    @GetMapping("/{id}")
    public D readById(@PathVariable ID id) {
        return mapper.toDto(service.readById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    @GetMapping
    public ResponseEntity<Collection<D>> readAll() {
        return ResponseEntity.ok(((Collection<D>) service.readAll()));
    }

    @PutMapping()
    public D update(@RequestBody D dto) {
        return mapper.toDto(service.update(mapper.toEntity(dto)));
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") ID id) {
        return  service.deleteById(id);
    }
}
