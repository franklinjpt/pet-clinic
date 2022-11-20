package dev.franklinjpt.petclinic.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OwnerDto {
    private String id;
    private String fullName;
    private String address;
    private String cellphone;
    private String email;
}
