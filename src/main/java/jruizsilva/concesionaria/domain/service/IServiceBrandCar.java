package jruizsilva.concesionaria.domain.service;

import jruizsilva.concesionaria.domain.pojo.PojoBrandCar;

import java.util.List;
import java.util.Optional;

public interface IServiceBrandCar {
  List<PojoBrandCar> findAll();
  
  Optional<PojoBrandCar> findById(Integer id);
  
  PojoBrandCar save(PojoBrandCar pojoBrandCar);
  
  Optional<PojoBrandCar> update(PojoBrandCar pojoBrandCar);
  
  boolean deleteById(Integer idBrandCar);
}
