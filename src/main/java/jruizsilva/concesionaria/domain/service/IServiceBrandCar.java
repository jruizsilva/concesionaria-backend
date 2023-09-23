package jruizsilva.concesionaria.domain.service;

import jruizsilva.concesionaria.domain.dto.DtoBrandCar;

import java.util.List;
import java.util.Optional;

public interface IServiceBrandCar {
  List<DtoBrandCar> findAll();
  
  Optional<DtoBrandCar> findById(Integer id);
  
  DtoBrandCar save(DtoBrandCar dtoBrandCar);
  
  Optional<DtoBrandCar> update(DtoBrandCar dtoBrandCar);
  
  boolean deleteById(Integer idBrandCar);
}
