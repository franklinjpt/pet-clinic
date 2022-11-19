package dev.franklinjpt.petclinic.business;

import dev.franklinjpt.petclinic.domain.DomainEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityExistsException;
import java.util.Optional;

public abstract class AbstractCrudService<E extends DomainEntity<K>, K> {

    protected final JpaRepository<E, K> repository;

    protected AbstractCrudService(JpaRepository<E, K> repository) {
        this.repository = repository;
    }

    public E create(E entity)throws EntityExistsException {
        if (repository.existsById(entity.getId()))
            throw new EntityExistsException("Entity" + entity + "already exists");
        return repository.save(entity);
    }

    public Optional<E> readById(K id) {
        return repository.findById(id);
    }

    public Iterable<E> readAll() {
        return repository.findAll();
    }

    public E update(E entity) throws EntityExistsException {
        if (repository.existsById(entity.getId()))
            return repository.save(entity);
        else
            throw new EntityExistsException("Entity" + entity + "does not exist");
    }

    public void deleteById(K id) {
        repository.deleteById(id);
    }
}
