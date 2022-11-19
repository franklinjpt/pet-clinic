package dev.franklinjpt.petclinic.dao;

import dev.franklinjpt.petclinic.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetJpaRepository extends JpaRepository<Pet, Long> {
}
