package jruizsilva.concesionaria.domain.repository;

import jruizsilva.concesionaria.domain.dto.BrandCarDto;

import java.util.List;
import java.util.Optional;

public interface IRepositoryBrandCar {
    List<BrandCarDto> findAll();

    Optional<BrandCarDto> findById(Integer id);

    BrandCarDto save(BrandCarDto brandCarDto);

    void deleteById(Integer id);
}
