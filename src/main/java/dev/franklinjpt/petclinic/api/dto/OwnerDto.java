package dev.franklinjpt.petclinic.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OwnerDto implements Serializable {
    private String id;
    private String fullName;
    private String address;
    private String cellphone;
    private String email;
}
