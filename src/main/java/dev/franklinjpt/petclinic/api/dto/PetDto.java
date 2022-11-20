package dev.franklinjpt.petclinic.api.dto;

import dev.franklinjpt.petclinic.domain.Specie;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PetDto {
    private long id;
    private String name;
    private LocalDate birthDate;
    private char sex;
    private String notes;
    private int specieId;
    private String ownerId;
    private Specie specie;
}
