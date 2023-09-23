package jruizsilva.concesionaria.domain.repository;

import jruizsilva.concesionaria.domain.dto.DtoBrandCar;

import java.util.List;
import java.util.Optional;

public interface IRepositoryBrandCar {
    List<DtoBrandCar> findAll();

    Optional<DtoBrandCar> findById(Integer id);

    DtoBrandCar save(DtoBrandCar dtoBrandCar);

    void deleteById(Integer id);
}
