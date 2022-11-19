package dev.franklinjpt.petclinic.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "pets")
public class Pet implements DomainEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    private Character sex;

    private String notes;

    @Column(name = "species_id")
    private Integer specieId;

    @Column(name = "owners_id")
    private String ownerId;

    @ManyToOne
    @JoinColumn(name = "species_id", insertable = false, updatable = false)
    private Specie specie;

    @ManyToOne
    @JoinColumn(name = "owners_id", insertable = false, updatable = false)
    private Owner owner;
}
