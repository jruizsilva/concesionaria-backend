package jruizsilva.concesionaria.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {
  private Integer id;
  private String fullName;
  private String email;
  private String phone;
  private Integer active;
  private String password;
}
