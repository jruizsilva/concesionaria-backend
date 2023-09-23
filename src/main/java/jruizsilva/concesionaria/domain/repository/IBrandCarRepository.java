package jruizsilva.concesionaria.domain.repository;

import jruizsilva.concesionaria.domain.pojo.BrandCarPojo;

import java.util.List;
import java.util.Optional;

public interface IBrandCarRepository {
    List<BrandCarPojo> findAll();

    Optional<BrandCarPojo> findById(Integer id);

    BrandCarPojo save(BrandCarPojo brandCarPojo);

    void deleteById(Integer idBrandCar);
}
