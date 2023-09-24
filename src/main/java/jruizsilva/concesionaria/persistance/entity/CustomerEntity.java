package jruizsilva.concesionaria.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class CustomerEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String id;
  private String fullName;
  private String email;
  private Double phoneNumber;
  private Integer active;
  private String password;
}
