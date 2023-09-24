package jruizsilva.concesionaria.domain.service;

import jruizsilva.concesionaria.domain.dto.BrandCarDto;

import java.util.List;
import java.util.Optional;

public interface IServiceBrandCar {
  List<BrandCarDto> findAll();
  
  Optional<BrandCarDto> findById(Integer id);
  
  BrandCarDto save(BrandCarDto brandCarDto);
  
  Optional<BrandCarDto> update(BrandCarDto brandCarDto);
  
  boolean deleteById(Integer idBrandCar);
}
