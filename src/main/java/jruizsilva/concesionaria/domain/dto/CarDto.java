package jruizsilva.concesionaria.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDto {
  private Integer id;
  private Integer brandCarId;
  private String reference;
  private Double price;
  private Double modelYear;
  private String color;
  private Double horsepower;
  private Double numberDoor;
  private Double engineDisplacement;
  private String transmission;
  private String fuelType;
  private Double numberSeats;
  private Double traction;
  private String steering;
  private String category;
  private String imagePath;
}
