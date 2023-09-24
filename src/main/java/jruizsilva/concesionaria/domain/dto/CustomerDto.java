package jruizsilva.concesionaria.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {
  private String id;
  private String fullName;
  private String email;
  private Double phoneNumber;
  private Integer active;
  private String password;
}
