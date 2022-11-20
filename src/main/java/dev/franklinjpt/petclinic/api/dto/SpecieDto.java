package dev.franklinjpt.petclinic.api.dto;

import dev.franklinjpt.petclinic.domain.Pet;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class SpecieDto {
    private int id;
    private String name;
    private String breed;
    private List<Pet> pets;
}
