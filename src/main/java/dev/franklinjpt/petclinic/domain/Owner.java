package dev.franklinjpt.petclinic.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "owners")
public class Owner implements DomainEntity<String>{

    @Id
    private String id;

    @Column(name = "full_name")
    private String fullName;

    private String address;

    private String cellphone;

    private String email;

    @OneToMany(mappedBy = "owner")
    private List<Pet> pets;
}
