package jruizsilva.concesionaria.persistance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cars")
public class CarEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer brandCarId;
  private String reference;
  private Double price;
  private Double modelYear;
  private String color;
  private Double horsepower;
  private Integer numberDoor;
  private Double engineDisplacement;
  private String transmission;
  private String fuelType;
  private Integer numberSeats;
  private Integer traction;
  private String steering;
  private String category;
  private String imagePath;
}
