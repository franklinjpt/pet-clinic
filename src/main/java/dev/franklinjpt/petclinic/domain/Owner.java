package dev.franklinjpt.petclinic.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "owners")
public class Owner {

    @Id
    private String id;

    @Column(name = "full_name")
    private String fullName;

    private String address;

    private String cellphone;

    private String email;
}
