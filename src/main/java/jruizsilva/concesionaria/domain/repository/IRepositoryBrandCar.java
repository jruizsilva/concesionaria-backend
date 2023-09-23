package jruizsilva.concesionaria.domain.repository;

import jruizsilva.concesionaria.domain.pojo.PojoBrandCar;

import java.util.List;
import java.util.Optional;

public interface IRepositoryBrandCar {
    List<PojoBrandCar> findAll();

    Optional<PojoBrandCar> findById(Integer id);

    PojoBrandCar save(PojoBrandCar pojoBrandCar);

    void deleteById(Integer id);
}
